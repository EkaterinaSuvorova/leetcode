import java.util.Arrays;

public class FindErrorNums {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        //int[] nums = {1,1};
        System.out.println(Arrays.asList(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];
        int dupInd = -1;
        for (int num : nums) {
            if (arr[num - 1] == 1) {
                dupInd = num - 1;
            }
            arr[num - 1] += 1;
        }
        int i = 0;
        for (int a : arr) {
            if (a == 0) {
                return new int[] {dupInd + 1, i + 1};
            }
            i++;
        }
        return null;
//        if (dupInd > 0 && arr[dupInd - 1] == 0) {
//            return new int[] {dupInd, dupInd + 1};
//        } else {
//            return new int[] {dupInd + 1, dupInd + 2};
//        }
    }
}
