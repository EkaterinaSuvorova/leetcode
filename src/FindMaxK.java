import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/?envType=daily-question&envId=2024-05-02
//2441. Largest Positive Integer That Exists With Its Negative
public class FindMaxK {
    public static void main(String[] args) {
        int[] nums1 = {-10,8,6,7,-2,-3};
        System.out.println(findMaxK(nums1));
    }

    public static int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length / 2);
        int max = -1;
        for (int num : nums) {
            if (set.contains(0 - num) && Math.abs(num) > max) {
                max = Math.abs(num);
            } else {
                set.add(num);
            }
        }
        return max;
    }
}
