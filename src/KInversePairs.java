
//https://leetcode.com/problems/k-inverse-pairs-array/description/?envType=daily-question&envId=2024-01-27
public class KInversePairs { //629
    public static void main(String[] args) {

    }

    public static int kInversePairs(int n, int k) {
        int[][] dp = new int[1001][1001];
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                for (int x = 0; x <= Math.min(j, i - 1); x++) {
                    if (j - x >= 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - x]) % 1000000007;
                    }
                }
            }
        }

        return dp[n][k];
    }
}
