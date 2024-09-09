//https://leetcode.com/problems/number-of-senior-citizens/?envType=daily-question&envId=2024-08-01
//2678. Number of Senior Citizens
public class CountSeniors {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                count++;
            }
        }
        return count;
    }
}
