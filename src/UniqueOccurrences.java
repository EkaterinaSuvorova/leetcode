import java.util.*;
import java.util.stream.Collectors;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.merge(a, 1, Integer::sum);
        }
        return map.size() == new HashSet<>(map.values()).size();
    }
}
