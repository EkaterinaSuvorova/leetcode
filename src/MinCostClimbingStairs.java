import java.util.HashMap;
import java.util.Map;

public class MinCostClimbingStairs {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
       int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        return dp(cost.length, cost);
    }

    private static int dp(int i, int[] cost) {
        if (i == 0 || i == 1) {
            return 0;
        }

        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        memo.put(i, Math.min(dp(i - 1, cost) + cost[i - 1], dp(i - 2, cost) + cost[i - 2]));

        return memo.get(i);
    }

}

