import java.util.HashMap;
import java.util.Map;

public class AmountOfTime {
    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(4, new TreeNode(9), new TreeNode(2));
        TreeNode left = new TreeNode(5, null, left1);
        TreeNode right = new TreeNode(3, new TreeNode(10), new TreeNode(6));
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(amountOfTime(root, 3));
    }

    public static int amountOfTime(TreeNode root, int start) {
        Map<Integer, TreeNode> parentMap = getParentMap(root, new HashMap<>());
        return findMaxDistance(root, 0, start);
    }

    private static Map<Integer, TreeNode> getParentMap(TreeNode node, Map<Integer, TreeNode> parentMap) {
        if (node != null) {
            if (node.left != null) {
                parentMap.put(node.left.val, node);
                parentMap = getParentMap(node.left, parentMap);
            }
            if (node.right != null) {
                parentMap.put(node.right.val, node);
                parentMap = getParentMap(node.right, parentMap);
            }
        }
        return parentMap;
    }

    private static int findMaxDistance(TreeNode node, int currDist, int start) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                return 1;
            }
            if (node.val == start) {
                return 1;
            }
            return 1 + Math.max(findMaxDistance(node.left, currDist + 1, start),
                    findMaxDistance(node.right, currDist + 1, start));
        }
        return 0;
    }
}
