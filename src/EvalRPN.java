import java.util.Stack;
import java.util.regex.Pattern;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/?envType=daily-question&envId=2024-01-30
//150. Evaluate Reverse Polish Notation
public class EvalRPN {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static void main(String[] args) {
        String[] tokens1 = {"2","1","+","3","*"}; //9
        String[] tokens2 = {"4","13","5","/","+"}; //6
        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}; //22
        String[] tokens4 = {"3","11","5","+","-"}; //13
        String[] tokens5 = {"3","11","+","5","-"}; //9
        String[] tokens6 = {"4","-2","/","2","-3","-","-"}; //-7
        System.out.println(evalRPN(tokens1));
        System.out.println(evalRPN(tokens2));
        System.out.println(evalRPN(tokens3));
        System.out.println(evalRPN(tokens4));
        System.out.println(evalRPN(tokens5));
        System.out.println(evalRPN(tokens6));
    }
    public static int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> nums = new Stack<>();
        int i = 0;
        while (i < tokens.length) {
            if ("+".equals(tokens[i])) {
                nums.add(nums.pop() + nums.pop());
            } else if ("-".equals(tokens[i])) {
                int b = nums.pop();
                int a = nums.pop();
                nums.add(a - b);
            } else if ("/".equals(tokens[i])) {
                int b = nums.pop();
                int a = nums.pop();
                nums.add(a / b);
            } else if ("*".equals(tokens[i])) {
                nums.add(nums.pop() * nums.pop());
            } else {
                nums.add(Integer.valueOf(tokens[i]));
            }
            i++;
        }
        return nums.pop();
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

}
