import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/uncommon-words-from-two-sentences/
//884. Uncommon Words from Two Sentences

public class UncommonFromSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> allWords = new HashSet<>();
        Set<String> uncommonWords = new HashSet<>();

        for (String word : s1.split("\\s+")) {
            if (allWords.contains(word)) {
                uncommonWords.remove(word);
            } else {
                uncommonWords.add(word);
            }
            allWords.add(word);
        }
        for (String word : s2.split("\\s+")) {
            if (allWords.contains(word)) {
                uncommonWords.remove(word);
            } else {
                uncommonWords.add(word);
            }
            allWords.add(word);
        }

        return uncommonWords.toArray(new String[uncommonWords.size()]);
    }
}
