//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/?envType=daily-question&envId=2025-03-12

public class MaximumCount {
    public int maximumCount(int[] nums) {
        int negCount = binarySearch(nums, 0);
        int posCount = nums.length - binarySearch(nums, 1);
        return Math.max(negCount, posCount);
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }

        return result;
    }
}
