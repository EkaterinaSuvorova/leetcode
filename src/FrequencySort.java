import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//https://leetcode.com/problems/sort-characters-by-frequency/
public class FrequencySort {
    public static void main(String[] args) {
        String s1 = "tree";
        System.out.println(frequencySort(s1));
    }
    public static String frequencySort(String s) {
        int[] freq = new int[128];
        for (char ch : s.toCharArray()) {
            freq[ch - '0'] += 1;
        }
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        int i = 0;
        while (i < freq.length) {
            if (freq[i] > 0) {
                String currString = map.getOrDefault(freq[i], "");
                map.put(freq[i], currString + String.valueOf((char)(i + '0')).repeat(freq[i]));
            }
            i++;
        }
        return String.join("", map.values());
    }
}
