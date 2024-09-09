import java.util.Comparator;

public class MaxWidthOfVerticalArea {
    public static void main(String[] args) {
        int[][] points = {{8,7}, {9,9}, {7,4}, {9,7}};
        System.out.println(maxWidthOfVerticalArea(points));
    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] xArr = new int[points.length];
        int i = 0;
        for (int[] row : points) {
            xArr[i] = row[0];
            i++;
        }
        java.util.Arrays.sort(xArr);
        int max = 0;
        for (int j = 0; j < xArr.length - 1; j++) {
           if (xArr[j + 1] - xArr[j] > max) {
               max = xArr[j + 1] - xArr[j];
           }
        }
        return max;
    }
}
