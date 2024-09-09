import java.math.BigInteger;

public class LargestOddNumber {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("239537672423884969653287101"));
    }

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((int) num.charAt(i) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
