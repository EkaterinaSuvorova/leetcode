
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        //String text1 = "abcde", text2 = "ace";
        //String text1 = "abc", text2 = "abc";
        String text1 = "abc", text2 = "def";
        //String text1 = "bl", text2 = "yby";
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        if (text1.equals(text2)) {
            return text1.length();
        }
        if (allCharactersSame(text1.toCharArray(), text2.toCharArray())) {
            return Math.min(text1.length(), text2.length());
        }
        return dp(text1.toCharArray(), 0, text2.toCharArray(), 0, 0);
    }

    private static int dp(char[] text1, int i1, char[] text2, int i2, int result) {
        if (i1 >= text1.length || i2 >= text2.length) {
            return result;
        }
        if (text1[i1] == text2[i2]) {
            result++;
            return Math.max(dp(text1, i1 + 1, text2, i2 + 1, result),
                    Math.max(dp(text1, i1 + 2, text2, i2 + 1, result), dp(text1, i1 + 1, text2, i2 + 2, result)));
        }
        return Math.max(dp(text1, i1 + 1, text2, i2 + 1, result),
                Math.max(dp(text1, i1 + 1, text2, i2, result), dp(text1, i1, text2, i2 + 1, result)));
    }

    private static boolean allCharactersSame(char[] s, char[] t) {
        int n = s.length;
        for (char ch : s)
            if (ch != s[0])
                return false;
        char ch = s[0];
        for (char tt : t)
            if (tt != ch)
                return false;
        return true;
    }

}
