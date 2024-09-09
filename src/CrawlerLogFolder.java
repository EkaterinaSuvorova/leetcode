import java.util.Stack;

//https://leetcode.com/problems/crawler-log-folder/?envType=daily-question&envId=2024-07-10
//1598. Crawler Log Folder
public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs1 = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs1));
        String[] logs2 = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs2));
        String[] logs3 = {"d1/","../","../","../"};
        System.out.println(minOperations(logs3));
    }

    public static int minOperations(String[] logs) {
        int step = 0;
        for (String log : logs) {
            switch (log) {
                case "../": {
                    if (step > 0) {
                        step--;
                    }
                    break;
                }
                case "./": {
                    break;
                }
                default: {
                    step++;
                    break;
                }
            }
        }
        return step;
    }

    public static int minOperations2(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String log : logs) {
            switch (log) {
                case "../": {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                }
                case "./": {
                    break;
                }
                default: {
                    stack.add(log);
                    break;
                }
            }
        }
        return stack.size();
    }
}
