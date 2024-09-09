public class MinFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix1 = {{2,1,3},{6,5,4},{7,8,9}};
        int[][] matrix2 = {{-84,-36,2},{87,-79,10},{42,10,63}};
//        System.out.println(minFallingPathSum(matrix1));
        System.out.println(minFallingPathSum(matrix2));
    }

    public static int minFallingPathSum(int[][] matrix) {
        return dp(matrix, 0, new int[matrix.length][matrix[0].length]);
    }

    private static int dp(int[][] matrix, int i, int[][] dp) {
        if (i == matrix.length) {
            return min(dp, i - 1);
        }

        if (i == 0) {
            int j = 0;
            while (j < matrix[0].length) {
                dp[i][j] = matrix[i][j];
                j++;
            }
        } else {
            int j = 0;
            while (j < matrix[0].length) {
                int min = Integer.MAX_VALUE;
                if (j > 0) {
                    min = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                }
                if (j < matrix[0].length - 1) {
                    min = Math.min(min, Math.min(dp[i - 1][j], dp[i - 1][j + 1]));
                }
                dp[i][j] = min + matrix[i][j];
                j++;
            }
        }
        return dp(matrix, i + 1, dp);
    }

    private static int min(int[][] dp, int row) {
        int min = Integer.MAX_VALUE;
        for (int v : dp[row]) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}
