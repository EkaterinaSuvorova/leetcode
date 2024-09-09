//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/?envType=daily-question&envId=2024-02-13
public class FirstPalindrome {
    public static void main(String[] args) {
        String[] words1 = {"abc","car","ada","racecar","cool"};
        String[] words2 = {"notapalindrome","racecar"};
        System.out.println(firstPalindrome(words1));
        System.out.println(firstPalindrome(words2));
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word.toCharArray())) {
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(char[] word) {
        int n = word.length / 2;
        int i = 0;
        while (i < n) {
            if (word[i] != word[word.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
