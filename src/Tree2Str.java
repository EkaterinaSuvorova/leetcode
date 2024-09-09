public class Tree2Str {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        System.out.println(tree2str(treeNode));
    }

    public static String tree2str(TreeNode root) {
        StringBuilder builder =  new StringBuilder();
        tree(root, builder);
        return builder.toString();
    }

    private static void tree(TreeNode node, StringBuilder builder) {
        builder.append(node.val);
        if (node.left != null) {
            builder.append("(");
            tree(node.left, builder);
            builder.append(")");
        }
        if (node.right != null) {
            builder.append("(");
            tree(node.right, builder);
            builder.append(")");
        }
    }
}
