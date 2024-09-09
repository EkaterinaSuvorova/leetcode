/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class RangeSumBST {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(5, new TreeNode(3), new TreeNode(7));
        TreeNode right = new TreeNode(15, null, new TreeNode(18));
        TreeNode root = new TreeNode(10, left, right);
        System.out.println(rangeSumBST(root, 7, 15));

//        TreeNode left1 = new TreeNode(3, new TreeNode(1), null);
//        TreeNode left2 = new TreeNode(7, new TreeNode(6), null);
//        TreeNode left = new TreeNode(5, left1, left2);
//        TreeNode right = new TreeNode(15, new TreeNode(13), new TreeNode(18));
//        TreeNode root = new TreeNode(10, left, right);
//        System.out.println(rangeSumBST(root, 6, 10));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        return recursion(root, low, high, 0);
    }

    private static int recursion(TreeNode node, int low, int high, int sum) {
        if (node == null) {
            return 0;
        }
        if (node.val < low) {
            return recursion(node.right, low, high, sum);
        }
        if (node.val > high) {
            return recursion(node.left, low, high, sum);
        }
//        if (node.val == low) {
//            return low;
//        }
//        if (node.val == high) {
//            return high;
//        }
        sum = sum + node.val + recursion(node.left, low, node.val, sum) + recursion(node.right, node.val, high, sum);
        return sum;
    }


}
