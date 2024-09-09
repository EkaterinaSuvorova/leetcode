import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/?envType=daily-question&envId=2024-02-12
public class MajorityElement {
    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        int maxCount = 0;
        int result = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int newCount = map.getOrDefault(num, 0) + 1;
            if (newCount > maxCount) {
                maxCount = newCount;
                result = num;
            }
            map.put(num, newCount);
        }

        return result;
    }
}
