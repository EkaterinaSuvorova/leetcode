//https://leetcode.com/problems/count-number-of-teams/?envType=daily-question&envId=2024-07-29
//1395. Count Number of Teams
public class NumTeams {
    public static void main(String[] args) {
        int[] rating = {2,5,3,4,1};
        System.out.println(numTeams(rating));
    }
    public static int numTeams(int[] rating) {
        return find(-1, -1, -1, 0, rating);
    }

    private static int find(int first, int second, int third, int index, int[] rating) {
        if (third != -1) {
            return 1;
        }
        if (index == rating.length) {
            return 0;
        }
        if (first == -1) {
            return find(index, second, third, index + 1, rating) + find(first, second, third, index + 1, rating);
        }
        if (second == -1) {
            if (rating[first] < rating[index] || rating[first] > rating[index]) {
                return find(first, index, third, index + 1, rating) + find(first, second, third, index + 1, rating);
            } else {
                return 0;
            }
        }
        if (rating[first] < rating[second] && rating[second] < rating[index]
                || rating[first] > rating[second] && rating[second] > rating[index]) {
            return 1 + find(first, second, third, index + 1, rating);
        } else {
            return find(first, second, third, index + 1, rating);
        }
    }
}
