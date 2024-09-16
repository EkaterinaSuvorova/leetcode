//https://leetcode.com/problems/count-the-number-of-consistent-strings/
//1684. Count the Number of Consistent Strings

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        Set<Character> allowedSet = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allowedSet.add(ch);
        }

        for (String word : words) {
            Stream<Character> charStream = IntStream.range(0, word.length())
                    .mapToObj(i -> word.toCharArray()[i]);
            if (charStream.allMatch(allowedSet::contains)) {
                result++;
            }
        }
        return result;
    }

    public int countConsistentStringsWithoutStream(String allowed, String[] words) {
        int result = 0;
        Set<Character> allowedSet = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allowedSet.add(ch);
        }

        for (String word : words) {
            boolean isAllowed = true;
            for (char ch : word.toCharArray()) {
                if (!allowedSet.contains(ch)) {
                    isAllowed = false;
                    break;
                }
            }
            if (isAllowed) {
                result++;
            }
        }
        return result;
    }
}
