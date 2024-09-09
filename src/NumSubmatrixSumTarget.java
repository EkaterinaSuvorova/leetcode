import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/?envType=daily-question&envId=2024-01-28
//1074. Number of Submatrices That Sum to Target
public class NumSubmatrixSumTarget {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        int target = 0;
        System.out.println(numSubmatrixSumTarget(matrix, target));
    }

    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count = 0;

        int rowStart = 0;
        while (rowStart < matrix.length) {
            int[] sum = new int[matrix[0].length];
            int rowEnd = rowStart;
            while (rowEnd < matrix.length) {
                int col = 0;
                while (col < matrix[0].length) {
                    sum[col] += matrix[rowEnd][col];
                    col++;
                }

                count += subarraySum(sum, target);
                rowEnd++;
            }
            rowStart++;
        }

        return count;
    }

    private static int subarraySum(int[] nums, int target) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            sum += num;

            if (sum == target) {
                count++;
            }

            if (mp.containsKey(sum - target)) {
                count += mp.get(sum - target);
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
