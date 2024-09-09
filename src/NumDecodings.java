import java.util.Arrays;

public class NumDecodings {
    public static void main(String[] args) {
        String s = "226";
        System.out.println(numDecodings(s));
    }

    public static int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return topDownDecode(s, 0, memo);
    }

    private static int topDownDecode(String s, int index, int[] memo) {
        if (index == s.length()) {
            return 1;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        if (s.charAt(index) == '0') {
            return 0;
        }

        int ways = topDownDecode(s, index + 1, memo);

        if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            ways += topDownDecode(s, index + 2, memo);
        }

        memo[index] = ways;

        return ways;
    }

    public static int numDecodings2(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return recursiveDecode(s.toCharArray(), 0, memo);
    }

    private static int recursiveDecode(char[] chars, int index, int[] memo) {
        if (index == chars.length) {
            return 1;
        }
        if (memo[index] != -1) {
            return memo[index];
        }
        if (chars[index] == '0') {
            return 0;
        }

        int ways = recursiveDecode(chars, ++index, memo);;
        if (index + 1 < chars.length && Integer.parseInt(String.format("%s%s", chars[index], chars[index + 1])) <= 26) {
            ways += recursiveDecode(chars, index + 2, memo);
        }
        memo[index] = ways;

        return ways;
    }
}
