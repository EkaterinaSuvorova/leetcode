import java.util.*;

public class CloseStrings {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "bca";
        String word21 = "a", word22 = "aa";
        String word31 = "cabbba", word32 = "abbccc";
        //System.out.println(closeStrings(word1, word2));
        //ystem.out.println(closeStrings(word21, word22));
        System.out.println(closeStrings(word31, word32));
    }

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] count1 = lettersCount(word1);
        int[] count2 = lettersCount(word2);

        int i = 0;
        while (i < 27) {
            if ((count1[i] != 0 && count2[i] == 0) || (count1[i] == 0 && count2[i] != 0)) {
                return false;
            }
           if (count1[i] == count2[i]) {
               count1[i] = 0;
               count2[i] = 0;
            }
            i++;
        }
        Arrays.sort(count1);
        Arrays.sort(count2);

        i = 26;
        while (i >= 0) {
            if (count1[i] != count2[i]) {
                return false;
            }
            i--;
        }

        return true;
    }

    private static int[] lettersCount(String s) {
        int[] count = new int[27];
        for (char ch : s.toCharArray()) {
            count[ch - 'a'] += 1;
        }
        return count;
    }
}
