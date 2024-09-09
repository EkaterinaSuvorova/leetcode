import java.util.Arrays;

public class MinDifficulty {
    public static void main(String[] args) {
        int[] jobDifficulty1 = {6,5,4,3,2,1};
        int d1 = 2;
        System.out.println(minDifficulty(jobDifficulty1, d1));
    }

    public static int minDifficulty(int[] jobDifficulty, int d) {
        if (d > jobDifficulty.length) {
            return -1;
        }
        if (d == jobDifficulty.length) {
            return Arrays.stream(jobDifficulty).sum();
        }

        int n = jobDifficulty.length;
        int[][] dp = new int [n + 1][d + 1];
//
//        for (int i = n; i >= 0; i--) {
//            for (int j = 0; j <= d; j++) {
//                if (j == 0) {
//                    dp[i][j] = -1;
//                }
//                if (j == 1) {
//                    dp[i][j] = jobDifficulty[i];
//                }
//                dp[i][j] = dp[i + 1][j - 1];
//
//            }
//
//        }
        return dp[0][d];
    }
}
