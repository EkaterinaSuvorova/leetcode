import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/description/
//78. Subsets
public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        solve(nums, 0, op, res);
        return res;
    }

    public static void solve(int nums[], int start, List<Integer> op, List<List<Integer>> res){
        if (nums.length == start){
            res.add(new ArrayList<>(op));
        } else {
            solve(nums, start + 1, op, res);
            op.add(nums[start]);
            solve(nums, start + 1, op, res);
            op.remove(op.size() - 1);
        }
    }
}
