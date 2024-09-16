import java.util.*;


//https://leetcode.com/problems/minimum-time-difference/
//539. Minimum Time Difference
public class FindMinDifference {

    public int findMinDifference(List<String> timePoints) {
        List<Integer> secTimePoints = new ArrayList<>();
        for (String timePoint : timePoints) {
            secTimePoints.add(Integer.valueOf(timePoint.substring(0, 2)) * 60 + Integer.valueOf(timePoint.substring(3, 5)));
        }
        Collections.sort(secTimePoints);
        int minDiff = Integer.MAX_VALUE;
        int i = 1;
        while (i < secTimePoints.size()) {
            int diff = secTimePoints.get(i) - secTimePoints.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
            }
            i++;
        }

        int firstLastDiff = 24 * 60 - secTimePoints.get(secTimePoints.size() - 1) + secTimePoints.get(0);
        if (firstLastDiff < minDiff) {
            minDiff = firstLastDiff;
        }

        return minDiff;
    }
}
