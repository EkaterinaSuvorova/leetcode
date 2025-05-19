import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/type-of-triangle/?envType=daily-question&envId=2025-05-19
//3024. Type of Triangle
public class TriangleType {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }
        if (set.size() == 1) {
            return "equilateral";
        }
        if (set.size() == 2) {
            return "isosceles";
        }
        return "scalene";
    }
}
