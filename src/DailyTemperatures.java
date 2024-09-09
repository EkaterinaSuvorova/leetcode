import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/daily-temperatures/?envType=daily-question&envId=2024-01-31
//739. Daily Temperatures
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures1 = {73,74,75,71,69,72,76,73};
        int[] temperatures2 = {89,62,70,58,47,47,46,76,100,70};
        //dailyTemperatures(temperatures1);
        dailyTemperatures(temperatures2);
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int i = 0;
        int[] result = new int[temperatures.length];
        Map<Integer, List<Integer>> tmps = new TreeMap<>();

        while (i < temperatures.length) {
            int finalI = i;
            Set<Integer> lowerTmp = tmps.keySet().stream().filter(v -> v < temperatures[finalI]).collect(Collectors.toSet());
            if (!lowerTmp.isEmpty()) {
                lowerTmp.forEach(lowTmp -> {
                    tmps.get(lowTmp).forEach(ind -> result[ind] = finalI - ind);
                    tmps.remove(lowTmp);
                });
            }
            List<Integer> list = tmps.getOrDefault(temperatures[i], new ArrayList<>());
            list.add(i);
            tmps.put(temperatures[i], list);
            i++;
        }
        return result;
    }


}
