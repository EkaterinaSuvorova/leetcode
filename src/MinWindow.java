import java.util.HashMap;
import java.util.Map;

public class MinWindow {
    public static void main(String[] args) {
        String s1 = "ADOBECODEBANC", t1 = "ABC";
        System.out.println(minWindow(s1, t1));
    }
    public static String minWindow(String s, String t) {
        Map<Character, Integer> tChars = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tChars.merge(ch, 1, (k, v) -> v + 1);
        }
        int[] sCharNums = new int[52];
        char[] sChars = s.toCharArray();
        int left = 0;
        int right = 0;

        while (left < s.length()) {
            while (right < s.length()) {
                //if ()
                //todo
            }
        }

        return null;
    }
}
