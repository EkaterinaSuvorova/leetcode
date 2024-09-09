import java.util.ArrayList;
import java.util.List;

public class FindMatrix {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,1,2,3,1};
        int[] nums2 = {1,2,3,4};
        System.out.println(findMatrix(nums1));
        System.out.println(findMatrix(nums2));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int n : nums) {
            boolean rowUpdated = false;
            for (List<Integer> row : result) {
                if (!rowUpdated) {
                    if (!row.contains(n)) {
                        row.add(n);
                        rowUpdated = true;
                    }
                } else {
                    break;
                }
            }
            if (!rowUpdated) {
                result.add(new ArrayList<>(List.of(n)));
            }
        }
        return result;
    }
}
