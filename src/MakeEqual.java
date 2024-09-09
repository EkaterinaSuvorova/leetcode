import java.util.HashMap;
import java.util.Map;

public class MakeEqual {
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        String[] words2 = {"ab","a"};
        System.out.println(makeEqual(words));
        System.out.println(makeEqual(words2));
    }

    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> symbols = new HashMap<>();

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                symbols.merge(ch, 1, Integer::sum);
            }
        }

        return symbols.values().stream().noneMatch(v -> v % words.length != 0);
    }
}
