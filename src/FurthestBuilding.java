import java.util.Collections;
import java.util.PriorityQueue;

// https://leetcode.com/problems/furthest-building-you-can-reach/description/?envType=daily-question&envId=2024-02-17
public class FurthestBuilding {
    public static void main(String[] args) {
        int[] heights = {4,12,2,7,3,18,20,3,19}; int bricks = 10; int ladders = 2;
        //int[] heights = {14,3,19,3}; int bricks = 17; int ladders = 0;
        System.out.println(furthestBuilding(heights, bricks, ladders));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;
        while (i < heights.length - 1) {
            if (heights[i] < heights[i + 1]) {
                pq.add(heights[i + 1] - heights[i]);

                bricks -= heights[i + 1] - heights[i];

                if (bricks < 0 && ladders == 0) {
                    return i;
                }
                if (bricks < 0 && ladders > 0) {
                    ladders--;
                    bricks += pq.poll();
                }
            }
           i++;
        }
        return i;
    }
}
