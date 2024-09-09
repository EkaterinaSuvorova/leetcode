public class MinCost {
    public static void main(String[] args) {
        String colors = "abaac";
        String colors2 = "abc";
        String colors3 = "aabaa";
        String colors4 = "aaabbbabbbb";
        int[] neededTime = {1,2,3,4,5};
        int[] neededTime2 = {1,2,3};
        int[] neededTime3 = {1,2,3,4,1};
        int[] neededTime4 = {3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(minCost(colors, neededTime));
        System.out.println(minCost(colors2, neededTime2));
        System.out.println(minCost(colors3, neededTime3));
        System.out.println(minCost(colors4, neededTime4));
    }

    public static int minCost(String colors, int[] neededTime) {
        char[] chars = colors.toCharArray();
        int start = 0, end = 0;
        int max = 0;
        int result = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                if (max == 0) {
                    max = neededTime[i];
                }
                max = Math.max(max, neededTime[i + 1]);
                end = i + 1;
            }
            if (chars[i] != chars[i + 1] || i == chars.length - 2) {
                if (end - start > 0) {
                    for (int j = start; j <= end; j++) {
                        result += neededTime[j];
                    }
                    result -= max;
                    max = 0;
                }
                start = i + 1;
                end = i + 1;
            }
        }
        return result;
    }
}
