import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int leftCount = 0;
        int rightCount = 0;

        char[] chars = s.toCharArray();
        int i = 0;
        while (i < s.length()/2) {
            if (vowels.contains(chars[i])) {
                leftCount++;
            }
            if (vowels.contains(chars[s.length() - 1 - i])) {
                rightCount++;
            }
            i++;
        }

        return leftCount == rightCount;
    }
}
