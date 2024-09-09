import java.util.Arrays;

//https://leetcode.com/problems/hand-of-straights/description/
//846. Hand of Straights
public class IsNStraightHand {
    public static void main(String[] args) {
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        System.out.println(isNStraightHand(hand, groupSize));
    }
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);

        for (int i = 0; i < groupSize; i++) {

        }

        return false;
    }
}
