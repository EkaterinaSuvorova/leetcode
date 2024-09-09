public class MinSteps {
    public static void main(String[] args) {
        String s1 = "bab", t1 = "aba";
        System.out.println(minSteps(s1, t1));
    }

    public static int minSteps(String s, String t) {
        int[] countS = lettersCount(s);
        int[] countT = lettersCount(t);
        int i = 0;
        int result = 0;
        while (i < 27) {
            if (countT[i] < countS[i]) {
                result += countS[i] - countT[i];
            }
            i++;
        }
        return result;
    }

    private static int[] lettersCount(String s) {
        int[] count = new int[27];
        for (char ch : s.toCharArray()) {
            count[ch - 'a'] += 1;
        }
        return count;
    }
}
