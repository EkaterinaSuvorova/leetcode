public class MaxProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int [] {3, 7}));
    }

    public static int maxProduct(int[] nums) {
        int a = Math.max(nums[0], nums[1]);
        int b = Math.min(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > b) {
                if (nums[i] > a) {
                    b = a;
                    a = nums[i];
                } else {
                    b = nums[i];
                }
            }
        }
        return (a - 1) * (b - 1);
    }
}
