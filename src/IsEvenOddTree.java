import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/even-odd-tree/?envType=daily-question&envId=2024-02-29
public class IsEvenOddTree {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(10, new TreeNode(3, new TreeNode(12), new TreeNode(8)), null);
        TreeNode right = new TreeNode(4, new TreeNode(7, new TreeNode(6), null), new TreeNode(9, null, new TreeNode(2)));
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(isEvenOddTree(root));

        TreeNode left1 = new TreeNode(4, new TreeNode(3), new TreeNode(3));
        TreeNode right1 = new TreeNode(2, new TreeNode(7), null);
        TreeNode root1 = new TreeNode(5, left1, right1);
        System.out.println(isEvenOddTree(root1));
    }

    public static boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isDone = false;
        boolean isEven = true;
        while (!isDone) {
            List<TreeNode> newNodes = new ArrayList<>();
            int prevVal = 0;
            if (!isEven) {
                prevVal = Integer.MAX_VALUE;
            }
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (isEven(node.val) == isEven) {
                    return false;
                }
                if (isEven && node.val <= prevVal || !isEven && node.val >= prevVal) {
                    return false;
                }
                prevVal = node.val;
                if (node.left != null) {
                    newNodes.add(node.left);
                }
                if (node.right != null) {
                    newNodes.add(node.right);
                }
            }
            if (newNodes.isEmpty()) {
                isDone = true;
            } else {
                isEven = !isEven;
                queue.addAll(newNodes);
            }
        }
        return true;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }


}
