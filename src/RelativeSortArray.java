import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/relative-sort-array/?envType=daily-question&envId=2024-06-11
//1122. Relative Sort Array
public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        relativeSortArray(arr1, arr2);
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            map.put(i, arr2[i]);
        }
        return sortRelative(arr1, map);
    }

    private static int[] sortRelative(int[] arr1, Map<Integer, Integer> map) {
        int[] res = new int[arr1.length];
        Map<Integer, Integer> counts = new HashMap<>();
        int indexNotIncluded = res.length - 1;
        for (int a : arr1) {
            if (map.containsValue(a)) {
                counts.merge(a, 1, (k, v) -> v + 1);
            } else {
                res[indexNotIncluded] = a;
                indexNotIncluded--;
            }
        }
        Arrays.sort(res, indexNotIncluded + 1, res.length);
        int j = 0;
        for (int i = 0; i < map.size(); i++) {
            while (counts.get(map.get(i)) > 0) {
                j += counts.get(map.get(i));
                res[j -  counts.get(map.get(i))] = counts.get(map.get(i));
                counts.merge(map.get(i), 0, (k, v) -> v - 1);
            }
        }

        return res;
    }
}
