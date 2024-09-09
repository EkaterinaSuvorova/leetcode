import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/find-bottom-left-tree-value/?envType=daily-question&envId=2024-02-28
public class FindBottomLeftValue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(findBottomLeftValue(root));
    }

    public static int findBottomLeftValue(TreeNode root) {
        int last = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                if (i == 0)
                    last = curr.val;  // last leftMost val
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return last;
    }

    private static int findBottomLeftValueSubtree(TreeNode root, int level, int maxLevel, int val) {
        if (root.left != null) {
            return findBottomLeftValueSubtree(root.left, level + 1, maxLevel, val);
        } else if (root.right != null) {
            return findBottomLeftValueSubtree(root.right, level + 1, maxLevel, val);
        } else {
            if (level > maxLevel) {
                return root.val;
            } else {
                return val;
            }
        }

    }

}
