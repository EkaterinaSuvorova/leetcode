import java.util.*;

//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/?envType=daily-question&envId=2024-07-11
//1190. Reverse Substrings Between Each Pair of Parentheses
public class ReverseParentheses {
    public static void main(String[] args) {
        String s1 = "(abcd)";
        System.out.println(reverseParentheses(s1));

        String s2 = "(u(love)i)";
        System.out.println(reverseParentheses(s2));

        String s3 = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s3));
    }

    public static String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> opened = new Stack<>();
        int[] pair = new int[n];
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '(') {
                opened.push(i);
            } else if (s.charAt(i) == ')') {
                int j = opened.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int direction = 1;
        while (i < n) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pair[i];
                direction = -direction;
            } else {
                sb.append(s.charAt(i));
            }
            i += direction;
        }
        return sb.toString();
    }
}
