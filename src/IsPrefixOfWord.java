//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
//1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
public class IsPrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int ind = 1;
        for (String word : sentence.split(" ")) {
           if (word.startsWith(searchWord)) {
               return ind;
           }
           ind++;
        }
        return -1;
    }
}
