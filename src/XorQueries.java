//https://leetcode.com/problems/xor-queries-of-a-subarray/
//1310. XOR Queries of a Subarray
public class XorQueries {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int[] prefix = new int[queries.length];

        for (int i = 0; i < prefix.length; i++) {
            if (i == 0) {
                prefix[i] = arr[i];
            } else {
                prefix[i] = prefix[i - 1] ^ arr[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (queries[i][0] == 0) {
                result[i] = prefix[queries[i][1]];
            } else {
                result[i] = prefix[queries[i][1]] ^ prefix[queries[i][0] - 1];
            }
        }

        return result;
    }
}
