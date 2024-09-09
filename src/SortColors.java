//https://leetcode.com/problems/sort-colors/?envType=daily-question&envId=2024-06-12
//75. Sort Colors
public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }
        int currColor = 0;
        int i = 0;
        while (i < nums.length) {
            while (currColor < 3 && count[currColor] > 0) {
                nums[i] = currColor;
                count[currColor]--;
                i++;
            }
            currColor++;
        }

    }
}
