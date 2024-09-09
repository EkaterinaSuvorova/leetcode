import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rob {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {4,1,2,7,5,3,1};
        System.out.println(rob(nums1));
        //System.out.println(rob(nums2));
    }

    public static int rob(int[] nums) {
        if (Arrays.stream(nums).allMatch(v -> v == 0)) {
            return 0;
        }
        return dp(nums, nums.length - 1, new int[nums.length]);
    }

    private static int dp(int[] nums, int i, int[] memo) {
        if (i == 0) {
            return nums[0];
        }
        if (i == 1) {
            return Math.max(nums[0], 1);
        }
        if (memo[i] == 0) {
            int max = Math.max(dp(nums, i - 1, memo), dp(nums, i - 2, memo) + nums[i]);
            memo[i] = max;
        }
        return memo[i];
    }
}
