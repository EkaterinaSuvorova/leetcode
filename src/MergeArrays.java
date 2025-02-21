import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int n = 3;
        int[] nums2 = {2, 5, 6};
        merge(nums1, n, nums2);
    }
    public static void merge(int[] nums1, int n, int[] nums2) {
        int i = n - 1, j = nums2.length - 1;
        for (int k = nums1.length - 1; j >= 0 && k >= 0; k--) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
