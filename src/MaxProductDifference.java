public class MaxProductDifference {

    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        int max1 = 0, max2 = 0, min1 = 10001, min2 = 10001;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                if (nums[i] > max2) {
                    int temp = max2;
                    max2 = nums[i];
                    max1 = temp;
                } else {
                    max1 = nums[i];
                }
            }
            if (nums[i] < min1) {
                if (nums[i] < min2) {
                    int temp = min2;
                    min2 = nums[i];
                    min1 = temp;
                } else {
                    min1 = nums[i];
                }
            }
        }
        return max1 * max2 - min1 * min2;
    }
}
