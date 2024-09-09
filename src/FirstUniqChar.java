public class FirstUniqChar {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s1));
        System.out.println(firstUniqChar(s2));

    }
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] sChars = s.toCharArray();
        for (char ch : s.toCharArray()) {
            freq[ch - 'a'] += 1;
        }
        int i = 0;
        while (i < s.length()) {
            if (freq[sChars[i] - 'a'] == 1) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
