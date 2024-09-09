import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(inorderTraversal(node));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private static void traverse(TreeNode node, List<Integer> result) {
        if (node != null) {
            if (node.left != null) {
                traverse(node.left, result);
            }
            result.add(node.val);
            traverse(node.right, result);
        }
    }
}
