import java.util.Arrays;
import java.util.Collections;

//https://leetcode.com/problems/maximize-happiness-of-selected-children/?envType=daily-question&envId=2024-05-09
//3075. Maximize Happiness of Selected Children
public class MaximumHappinessSum {
    public static void main(String[] args) {
        int[] happiness1 = {1,2,3};
        int k1 = 2;
        System.out.println(maximumHappinessSum(happiness1, k1));
    }

    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int dec = 0;
        long max = 0;
        int value = 0;
        for (int i = happiness.length - 1; i >= happiness.length - k; i--) {
            value = happiness[i] - dec;
            dec++;
            if (value > 0) {
                max += value;
            }
        }
        return max;
    }
}
