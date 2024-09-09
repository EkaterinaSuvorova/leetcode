import java.util.PriorityQueue;

//https://leetcode.com/problems/k-th-smallest-prime-fraction/?envType=daily-question&envId=2024-05-10
//786. K-th Smallest Prime Fraction
public class KthSmallestPrimeFraction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5}; int k = 3;
        kthSmallestPrimeFraction(arr, k);
    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                k--;
                if (k == 0) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return null;
    }
}
