import java.util.Arrays;

public class LargestThreeSameDigitNumber {
    public static void main(String[] args) {

    }

    private String largestGoodInteger(String num) {
        String[] numbers = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for (String s : numbers) {
            if (num.indexOf(s) >= 0) {
                return s;
            }
        }
        return "";
    }
}
