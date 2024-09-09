//https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/
//2486. Append Characters to String to Make Subsequence
public class AppendCharacters {
    public static void main(String[] args) {
        String s = "coaching", t = "coding";
        System.out.println(appendCharacters(s, t));
    }

    public static int appendCharacters(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int i = 0;
        int j = 0;
        while (i < sArr.length && j < tArr.length) {
            if (tArr[j] == sArr[i]) {
                j++;
            }
            i++;
        }
        return tArr.length - j;
    }
}

