//https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/?envType=daily-question&envId=2025-05-27
//2894. Divisible and Non-divisible Sums Difference
public class DifferenceOfSums {
    public int differenceOfSums(int n, int m) {
        int sum = n * (n + 1) / 2;
        int num1 = 0;
        for (int i = m; i <= n; i+=m) {
                num1 += i;
        }
        return sum - 2 * num1;
    }
}
