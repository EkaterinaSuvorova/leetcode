import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs1));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return List.copyOf(map.values());
    }
}
