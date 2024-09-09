import java.util.HashMap;
import java.util.Map;

public class NumberOfArithmeticSlices {
    public static void main(String[] args) {
        int[] nums1 = {2,4,6,8,10};
        System.out.println(numberOfArithmeticSlices(nums1));
    }
    public static int numberOfArithmeticSlices(int[] nums) {
        int totalCount = 0;

        HashMap<Integer, Integer>[] dp = new HashMap[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            dp[i] = new HashMap<>();
        }

        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                long diff = (long) nums[i] - nums[j];

                if (diff > Integer.MAX_VALUE || diff < Integer.MIN_VALUE) {
                    continue;
                }

                int diffInt = (int) diff;

                dp[i].put(diffInt, dp[i].getOrDefault(diffInt, 0) + 1);
                if (dp[j].containsKey(diffInt)) {
                    dp[i].put(diffInt, dp[i].get(diffInt) + dp[j].get(diffInt));
                    totalCount += dp[j].get(diffInt);
                }
            }
        }

        return totalCount;
    }
}
