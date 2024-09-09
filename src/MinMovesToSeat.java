import java.util.Arrays;

//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/?envType=daily-question&envId=2024-06-13
//2037. Minimum Number of Moves to Seat Everyone
public class MinMovesToSeat {
    public static void main(String[] args) {

    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int result = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }
}
