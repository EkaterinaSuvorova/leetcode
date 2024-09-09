import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        System.out.println(leafSimilar(root1, root2));

    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = getLeafSeq(root1, new ArrayList<>());
        List<Integer> seq2 = getLeafSeq(root2, new ArrayList<>());

        return seq1.equals(seq2);
    }

    private static List<Integer> getLeafSeq(TreeNode node, List<Integer> seq) {
        if (node.left == null && node.right == null) {
            seq.add(node.val);
        }
        if (node.left != null) {
            seq = getLeafSeq(node.left, seq);
            seq = getLeafSeq(node.right, seq);
        }
        return seq;
    }
}
