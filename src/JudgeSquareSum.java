//https://leetcode.com/problems/sum-of-square-numbers/
//633. Sum of Square Numbers
public class JudgeSquareSum {
    public static void main(String[] args) {
        judgeSquareSum(0);
    }

    public static boolean judgeSquareSum(int c) {
        int b;
        for (int a = 0; a <= Math.sqrt(c); a++) {
            b = (int) Math.sqrt(c - a * a);
            if (a * a + b * b == c) {
                return true;
            }
        }
        return false;
    }
}
