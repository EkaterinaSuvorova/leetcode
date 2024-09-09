import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//3. Longest Substring Without Repeating Characters
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s1));

        String s2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;

        if (s.isEmpty()) {
            return 0;
        } else {
            int i = 0;
            int j = 0;
            Map<Character, Integer> charPosition = new HashMap<>();

            while (i < s.length() - 2) {
                while (j < s.length() - 1) {
                    if (charPosition.containsKey(s.charAt(j))) {
                        i = charPosition.get(s.charAt(j)) + 1;
                        charPosition.remove(s.charAt(j));
                    } else {
                        charPosition.put(s.charAt(j), j);
                    }
                    j++;
                }
            }
        }

        return result;
    }
}
