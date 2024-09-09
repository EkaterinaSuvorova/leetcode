import java.util.Arrays;

//https://leetcode.com/problems/missing-number/?envType=daily-question&envId=2024-02-20
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int prev = 0;
        for (int num : nums) {
            if (num - prev == 2) {
                return num - 1;
            }
            prev = num;
        }
        return prev + 1;
    }
}
