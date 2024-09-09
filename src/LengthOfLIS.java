import java.util.TreeSet;

public class LengthOfLIS {
    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(nums1));
    }

    public static int lengthOfLIS(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int num : nums) {
            Integer val = ts.ceiling(num);//gives the next greater or equal element in TreeSet
            if (val != null) {
                ts.remove(val);
            }
            ts.add(num);
        }
        return ts.size();
    }
}
