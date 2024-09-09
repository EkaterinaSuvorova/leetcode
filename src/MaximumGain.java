import java.util.Stack;

//https://leetcode.com/problems/maximum-score-from-removing-substrings/
//1717. Maximum Score From Removing Substrings
public class MaximumGain {
    public static void main(String[] args) {
        String s1 = "cdbcbbaaabab";
        int x1 = 4, y1 = 5;
        System.out.println(maximumGain(s1, x1, y1));

    }

    public static int maximumGain(String s, int x, int y) {
        String top, bot;
        int topScore, botScore;
        if (x > y) {
            top = "ab";
            topScore = x;
            bot = "ba";
            botScore = y;
        } else {
            top = "ba";
            topScore = y;
            bot = "ab";
            botScore = x;
        }
        int result = 0;

        StringBuilder stack = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (stack.length() != 0 && (ch == top.charAt(1)) && stack.charAt(stack.length() - 1) == top.charAt(0)) {
                result += topScore;
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(ch);
            }
        }

        StringBuilder botStack = new StringBuilder();
        for (char ch : stack.toString().toCharArray()) {
            if (botStack.length() > 0 && ch == bot.charAt(1) && botStack.charAt(botStack.length() - 1)  == bot.charAt(0)) {
                result += botScore;
                botStack.deleteCharAt(botStack.length() - 1);
            } else {
                botStack.append(ch);
            }

        }

        return result;
    }

}
