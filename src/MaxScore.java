public class MaxScore {
    public static void main(String[] args) {
        String s = "1111";
        System.out.println(maxScore(s));
    }

    public static int maxScore(String s) {
        char[] chars = s.toCharArray();
        int left = chars[0] == '0' ? 1 : 0;
        int right = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == '1') {
                right++;
            }
        }
        int max = left + right;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == '0') {
                left++;
            } else {
                right--;
            }
            max = Math.max(max, left + right);
        }
        return max;
    }
}
