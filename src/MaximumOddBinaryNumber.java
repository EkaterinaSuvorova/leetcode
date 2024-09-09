import java.util.regex.Pattern;

//https://leetcode.com/problems/maximum-odd-binary-number/
public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        String s = "010";
        System.out.println(maximumOddBinaryNumber(s));
    }

    public static String maximumOddBinaryNumber(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                oneCount++;
            } else {
                zeroCount++;
            }
        }
        if (oneCount >= 1) {
            return "1".repeat(oneCount - 1) + "0".repeat(zeroCount) + "1";
        }
        return s;
    }
}
