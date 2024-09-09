import java.util.*;

public class FindWinners {
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        System.out.println(findWinners(matches));
    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> players = new HashSet<>();
        Map<Integer, Integer> lossCount = new HashMap<>();

        for (int[] match : matches) {
            if (lossCount.containsKey(match[1])) {
                lossCount.put(match[1], lossCount.get(match[1]) + 1);
            } else {
                lossCount.put(match[1], 1);
            }
            players.add(match[0]);
            players.add(match[1]);
        }

         List<Integer> zeros = new ArrayList<>();
         List<Integer> ones = new ArrayList<>();

         for (Integer player: players) {
             if (!lossCount.containsKey(player)) {
                 zeros.add(player);
             } else if (lossCount.get(player) == 1) {
                 ones.add(player);
             }
        }
         Collections.sort(zeros);
         Collections.sort(ones);

         return Arrays.asList(zeros, ones);
    }
}
