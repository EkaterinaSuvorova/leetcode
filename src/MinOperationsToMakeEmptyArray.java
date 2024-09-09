import java.util.HashMap;
import java.util.Map;

public class MinOperationsToMakeEmptyArray {
    public static void main(String[] args) {
        int[] nums1 = {2,3,3,2,2,4,2,3,4};
        int[] nums2 = {2,1,2,2,3,3};
        int[] nums3 = {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
//        System.out.println(minOperations(nums1));
//        System.out.println(minOperations(nums2));
        System.out.println(minOperations(nums3));
    }

    public static int minOperations(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null) {
                count = 0;
            }
            map.put(num, ++count);
        }

        for (Integer val : map.values()) {
            if (val == 1) {
                return -1;
            }
            int rem = val % 3;
            if (rem == 0) {
                res += val / 3;
            } else if ((rem == 2) || (rem == 1)) {
                res += val / 3 + 1;
            } else if (val % 2 == 0) {
                res += val / 2;
            }
        }
        return res;
    }
}
