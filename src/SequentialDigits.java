import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/sequential-digits/submissions/1164253813/
//1291. Sequential Digits
public class SequentialDigits {
    public static void main(String[] args) {
        //int low1 = 100, high1 = 300;
        //int low1 = 1000, high1 = 13000;
        int low1 = 58, high1 = 155;
        System.out.println(sequentialDigits(low1, high1));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        int lowLength = Integer.toString(low).length();
        int highLength = Integer.toString(high).length();
        int resultLength = lowLength;
        int number = 0;
        while (resultLength <= highLength) {
            int startDigit = 0;
            if (resultLength == lowLength) {
                startDigit = Integer.toString(low).charAt(0) - 48;
            } else {
                startDigit = 1;
            }

            while (number <= high && startDigit + resultLength - 1 <= 9) {
                number = 0;
                int inc = 0;
                int n = resultLength - 1;
                while (n >= 0 && number <= high) {
                    number += (int) (Math.pow(10, n) * (startDigit + inc++));
                    n--;
                }
                startDigit++;
                if (number <= high && number >= low) {
                    result.add(number);
                }
            }
            resultLength++;
        }
        return result;
    }
}
