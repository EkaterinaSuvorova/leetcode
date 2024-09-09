import java.util.Arrays;

public class DivideArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,8,7,9,3,5,1};
        int[] nums2 = {6,10,5,12,7,11,6,6,12,12,11,7};
        int k1 = 2;
        //divideArray(nums1, k1);
        divideArray(nums2, k1);
    }
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length / 3] [3];
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if ((i % 3 == 0) || ((nums[i] - result[j][0]) <= k)) {
                if (i != 0 && i % 3 == 0) {
                    j++;
                }
                result[j][i % 3] = nums[i];
                i++;
            } else {
             return new int[0][0];
            }
        }

        return result;
    }
}
