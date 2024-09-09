import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/largest-divisible-subset/
public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {1,2,3, 4, 8};
        int[] nums3 = {3,4,16,8};
        int[] nums4 = {5,9,18,54,108,540,90,180,360,720};
//        System.out.println(largestDivisibleSubset(nums1));
//        System.out.println(largestDivisibleSubset(nums2));
//        System.out.println(largestDivisibleSubset(nums3));
        System.out.println(largestDivisibleSubset(nums4));
    }
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        List<Integer> currentResult;
        int currentMax;

        int i = 0;
        int j;
        while (i < nums.length) {
            j = i + 1;
            currentMax = nums[i];
            currentResult = new ArrayList<>();
            currentResult.add(nums[i]);
            while (j < nums.length) {
                if (currentMax % nums[j] == 0 || nums[j] % currentMax == 0) {
                    currentMax = Math.max(currentMax, nums[j]);
                    currentResult.add(nums[j]);
                }
                j++;
            }
            if (currentResult.size() > result.size()) {
                result = currentResult;
            }
            i++;
        }

        return result;
    }
}
