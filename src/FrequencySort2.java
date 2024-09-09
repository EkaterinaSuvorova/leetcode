import java.util.*;

//https://leetcode.com/problems/sort-array-by-increasing-frequency/?envType=daily-question&envId=2024-07-23
//1636. Sort Array by Increasing Frequency
public class FrequencySort2 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,2,2,3};
        frequencySort(nums1);

        int[] nums2 = {2,3,1,3,2};
        frequencySort(nums2);
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqForNum = new HashMap<>();
        for (int num : nums) {
            freqForNum.merge(num, 1, Integer::sum);
        }

        Map<Integer, Set<Integer>> freqMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : freqForNum.entrySet()) {
            freqMap.computeIfAbsent(entry.getValue(), k -> new TreeSet<>(Comparator.reverseOrder())).add(entry.getKey());
        }

        int i = 0;
        for (Map.Entry<Integer, Set<Integer>> entry : freqMap.entrySet()) {
            for (int num : entry.getValue()) {
                int n = entry.getKey();
                while (n > 0) {
                    nums[i] = num;
                    i++;
                    n--;
                }
            }
        }


        return nums;
    }
}
