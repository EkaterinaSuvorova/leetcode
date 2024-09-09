import java.util.*;
import java.util.stream.Stream;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=daily-question&envId=2024-07-02
//350. Intersection of Two Arrays II
public class Intersect {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }


}
