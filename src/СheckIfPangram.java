import java.util.HashSet;
import java.util.Set;

public class СheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> usedSymbols = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            usedSymbols.add(ch);
        }
        return usedSymbols.size() == 26;
    }
}
