import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//https://leetcode.com/problems/sort-the-people/?envType=daily-question&envId=2024-07-22
//2418. Sort the People
public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> heightToNameMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < heights.length; i++) {
            heightToNameMap.put(heights[i], names[i]);
        }
        return heightToNameMap.values().toArray(new String[0]);
    }
}
