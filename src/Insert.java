//https://leetcode.com/problems/insert-interval/
//57. Insert Interval
public class Insert {
    public static void main(String[] args) {

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
//        int start = findStartIntervalPosition();
//        while (i >= 0 || i < intervals.length) {
//            if (newInterval[0] < intervals[i][1]) {
//                i -= i / 2;
//            } else {
//                i -= i / 2;
//            }
//        }
        return null;
    }

    private static int findStartIntervalPosition(int[][] intervals, int startValue) {
        int left = 0;
        int right = intervals.length - 1;
        while (left < right) {
            int mid = (right - left) / 2;
            if (startValue < intervals[mid][0]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return left;
    }
}
