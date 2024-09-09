import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

//https://leetcode.com/problems/find-the-winner-of-the-circular-game/?envType=daily-question&envId=2024-07-08
//1823. Find the Winner of the Circular Game
public class FindTheWinner {
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(findTheWinner(n, k));
        int n2 = 6, k2 = 5;
        System.out.println(findTheWinner(n2, k2));
    }
    public static int findTheWinner(int n, int k) {
            Queue<Integer> friends = new ArrayBlockingQueue<>(n);
            for (int i = 1; i <= n; i++) {
                friends.add(i);
            }
            Iterator<Integer> iterator = friends.iterator();

            while (friends.size() != 1) {
                for (int i = 1; i <= k; i++) {
                    if (!iterator.hasNext()) {
                        iterator = friends.iterator();
                    }
                    iterator.next();
                }
                iterator.remove();
            }

            return friends.peek();
    }
}
