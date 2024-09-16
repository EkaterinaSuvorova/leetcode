import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix-iv/
//2326. Spiral Matrix IV
public class SpiralMatrix {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], -1);
        }

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (head != null) {
            for (int j = left; j < right && head != null; j++) {
                result[top][j] = head.val;
                head = head.next;
            }

            for (int i = top; i < bottom && head != null; i++) {
                result[i][right] = head.val;
                head = head.next;
            }

            for (int j = right; j > left && head != null; j--) {
                result[bottom][j] = head.val;
                head = head.next;
            }

            for (int i = bottom; i > top && head != null; i--) {
                result[i][left] = head.val;
                head = head.next;
            }

            top++;
            left++;
            bottom--;
            right--;
        }

        return result;
    }
}
