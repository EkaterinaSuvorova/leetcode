import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/?envType=daily-question&envId=2024-01-29
//232. Implement Queue using Stacks
class MyQueue {
    private Stack stack1;
    private Stack stack2;


    public MyQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void push(int x) {
        if (stack1.empty() && !stack2.empty()) {
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }
        stack1.push(x);
    }

    public int pop() {
        if (stack2.empty() && !stack1.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return (int)stack2.pop();
    }

    public int peek() {
        if (stack2.empty() && !stack1.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return (int)stack2.peek();
    }

    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */