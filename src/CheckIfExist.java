//https://leetcode.com/problems/check-if-n-and-its-double-exist/submissions/1467777177/
//1346. Check If N and Its Double Exist
import java.util.HashSet;
import java.util.Set;

public class CheckIfExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> possiblePair = new HashSet<>();
        for (int num : arr) {
            if (possiblePair.contains(2 * num) || (num % 2 == 0 && possiblePair.contains(num / 2))) {
                return true;
            }
            possiblePair.add(num);
        }
        return false;
    }
}
