//https://leetcode.com/problems/longest-palindrome/
//409. Longest Palindrome

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {
        int[] counts = new int['z' - 'A' + 1];
        for (char ch : s.toCharArray()) {
            counts[ch - 'A']++;
        }
        boolean hasOne = false;
        int result = 0;

        for (int count : counts) {
            if (count != 0) {
                if (count % 2 == 0) {
                    result += count;
                } else if (hasOne) {
                    result += count - 1;
                } else {
                    result += count;
                    hasOne = true;
                }
            }
        }
        return result;
    }
}
