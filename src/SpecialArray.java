//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/?envType=daily-question&envId=2024-05-27
//1608. Special Array With X Elements Greater Than or Equal X
public class SpecialArray {
    public static void main(String[] args) {
        int[] nums1 = {0,0};
        System.out.println(specialArray(nums1));
    }

    public static int specialArray(int[] nums) {
        int[] freq = new int[1001];
        int max = 0;
        int res = -1;
        int elNum = nums.length;
        for (int n : nums) {
            max = Math.max(max, n);
            freq[n] = freq[n] + 1;
        }
        for (int i = 0; i <= max; i++) {
            if (elNum >= i) {
                res = i;
            }
            elNum -= freq[i];
        }
        return res != 0 ? res : -1;
    }
}
