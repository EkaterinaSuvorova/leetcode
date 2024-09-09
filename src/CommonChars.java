import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-common-characters/
//1002. Find Common Characters
public class CommonChars {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        commonChars(words);
    }

    public static List<String> commonChars(String[] words) {
        int[] lastCounts = count(words[0]);
        List<String> result = new ArrayList<>();
        for (int i = 1; i < words.length; i++) {
            int[] newCounts = count(words[i]);
            lastCounts = intersection(lastCounts, newCounts);
        }

        for (int i = 0; i < 26; i++) {
            if (lastCounts[i] > 0) {
                while (lastCounts[i] > 0) {
                    result.add(Character.toString((char) i + 'a'));
                    lastCounts[i]--;
                }
            }
        }
        return result;
    }

    private static int[] count(String word) {
        int[] counts = new int[26];
        for (char ch : word.toCharArray()) {
            counts[ch - 'a']++;
        }
        return counts;
    }

    private static int[] intersection(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            count1[i] = Math.min(count1[i], count2[i]);
        }
        return count1;
    }
}
