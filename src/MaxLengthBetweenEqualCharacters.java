import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxLengthBetweenEqualCharacters {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "abca";
        String s3 = "cbzxy";
        System.out.println(maxLengthBetweenEqualCharacters(s1));
        System.out.println(maxLengthBetweenEqualCharacters(s2));
        System.out.println(maxLengthBetweenEqualCharacters(s3));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        int[] map = new int[27];
        Arrays.fill(map, -1);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map[chars[i] - 97] != -1) {
                max = Math.max(max, i - map[chars[i] - 97] - 1);
            } else {
                map[chars[i] - 97] = i;
            }
        }

        return max;
    }
}
