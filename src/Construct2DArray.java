import java.util.Arrays;

//https://leetcode.com/problems/convert-1d-array-into-2d-array/
//2022. Convert 1D Array Into 2D Array
public class Construct2DArray {
    public static void main(String[] args) {
//        int[] original = {1,2,3,4};
//        int m = 2, n = 2;
//        construct2DArray(original, m, n);
        int[] original = {1,2,3};
        int m = 1, n = 3;
        construct2DArray(original, m, n);
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            result[i] = Arrays.copyOfRange(original, n * i, i * n + n);
        }
        return result;
    }
}