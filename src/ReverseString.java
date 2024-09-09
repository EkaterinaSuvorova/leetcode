//https://leetcode.com/problems/reverse-string/
//344. Reverse String
public class ReverseString {
    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
    }

    public static void reverseString(char[] s) {
        char tmp;
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}
