import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsAnagram {
    public static void main(String[] args) {
        //String s = "anagram", t = "nagaram";
        //String s = "r", t = "t";
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] dict = new int[27];

        for (char c : s.toCharArray()) {
            dict[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            dict[c - 'a']--;
        }
        for (int v : dict) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
