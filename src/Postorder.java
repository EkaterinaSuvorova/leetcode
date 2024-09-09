//https://leetcode.com/problems/n-ary-tree-postorder-traversal/?envType=daily-question&envId=2024-08-26
//590. N-ary Tree Postorder Traversal
import java.util.*;

public class Postorder {

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.add(root);

        while (!nodeStack.isEmpty()) {
            Node currNode = nodeStack.pop();
            res.add(currNode.val);

            nodeStack.addAll(currNode.children);
        }

        Collections.reverse(res);
        return res;
    }
}
