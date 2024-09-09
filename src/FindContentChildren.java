import java.util.Arrays;

public class FindContentChildren {
    public static void main(String[] args) {
        int[] g1 = {1,2,3}, s1 = {1,1};
        System.out.println(findContentChildren(g1, s1));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        int res = 0;

        int i = 0;
        while (i < g.length) {
            int j = 0;
            while (j < s.length) {
                if (s[j] >= g[i]) {
                    s[j] = -1;
                    res++;
                    break;
                }
                j++;
            }
            i++;
        }
        return res;
    }
}
