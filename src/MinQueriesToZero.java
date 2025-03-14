import java.util.Arrays;

//https://leetcode.com/problems/zero-array-transformation-ii/?envType=daily-question&envId=2025-03-13
public class MinQueriesToZero {
    public int minZeroArray(int[] nums, int[][] queries) {
        if (Arrays.stream(nums).allMatch(x -> x == 0)) return 0;

        int low = 1, high = queries.length;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canZeroArray(nums, queries, mid)) {
                ans = mid;
                high = mid - 1; // Try to minimize k
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean canZeroArray(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n + 1]; // Difference array

        for (int i = 0; i < k; i++) {
            int li = queries[i][0], ri = queries[i][1], vali = queries[i][2];
            diff[li] -= vali;
            diff[ri + 1] += vali; // Restore after ri
        }

        // Apply the difference array to reconstruct nums
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            if (nums[i] + curr > 0) {
                return false; // If any element remains positive, return false
            }
        }
        return true; // All elements are zero
    }

}
