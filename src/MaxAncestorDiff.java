public class MaxAncestorDiff {
    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(4, new TreeNode(6), new TreeNode(7));
        TreeNode left = new TreeNode(1, new TreeNode(3), left1);
        TreeNode right1 = new TreeNode(13, new TreeNode(14), null);
        TreeNode right = new TreeNode(10, right1, null);
        TreeNode root = new TreeNode(8, left, right);
        System.out.println(maxAncestorDiff(root));
    }

    public static int maxAncestorDiff(TreeNode root) {
        return maxAncestorSubtree(root, 0);
    }

    public static int maxAncestorSubtree(TreeNode root, int maxDiff) {
        if (root == null) {
            return maxDiff;
        }
        int min = min(root, root.val);
        int max = max(root, root.val);

        int currMax = Math.max(Math.abs(root.val - min), Math.abs(max - root.val));
        if (currMax > maxDiff) {
            maxDiff = currMax;
        }
        return Math.max(maxAncestorSubtree(root.right, maxDiff), maxAncestorSubtree(root.left, maxDiff));
    }

    private static int max(TreeNode node, int max) {
        if (node.val > max) {
            max = node.val;
        }
        if (node.left == null && node.right == null) {
            return max;
        }
        if (node.left == null) {
            return max(node.right, max);
        }
        if (node.right == null) {
            return max(node.left, max);
        }
        return Math.max(max(node.left, max), max(node.right, max));
    }

    private static int min(TreeNode node, int min) {
        if (node.val < min) {
            min = node.val;
        }
        if (node.left == null && node.right == null) {
            return min;
        }

        if (node.left == null) {
            return min(node.right, min);
        }
        if (node.right == null) {
            return min(node.left, min);
        }
        return Math.min(min(node.left, min), min(node.right, min));
    }
}
