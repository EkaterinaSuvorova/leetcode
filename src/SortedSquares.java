//https://leetcode.com/problems/squares-of-a-sorted-array/description/?envType=daily-question&envId=2024-03-02
public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(sortedSquares(nums));
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return result;
    }
}
