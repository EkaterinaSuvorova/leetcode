import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/?envType=daily-question&envId=2024-07-16
//2096. Step-By-Step Directions From a Binary Tree Node to Another
public class GetDirections {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(1, new TreeNode(3),null),
                new TreeNode( 2, new TreeNode(6),new TreeNode(4)));
        int startValue1 = 3, destValue1 = 6;
        System.out.println(getDirections(root, startValue1, destValue1));
    }

    public static String getDirections(TreeNode root, int startValue, int destValue) {
        List<String> pathToStart = new ArrayList<>();
        List<String> pathToDest = new ArrayList<>();
        findPath(root, startValue, pathToStart);
        findPath(root, destValue, pathToDest);

        int commonPathLength = 0;
        while (commonPathLength < pathToStart.size() && commonPathLength < pathToDest.size()
                && pathToStart.get(commonPathLength).equals(pathToDest.get(commonPathLength)) ) {
            commonPathLength++;
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < pathToStart.size() - commonPathLength; i++) {
            result.add("U");
        }

        result.addAll(pathToDest.subList(commonPathLength, pathToDest.size()));

        return String.join("", result);
    }

    private static boolean findPath(TreeNode root, int val, List<String> currPath) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }

        currPath.add("L");
        if (findPath(root.left, val, currPath)) {
            return true;
        }
        currPath.remove(currPath.size() - 1);

        currPath.add("R");
        if (findPath(root.right, val, currPath)) {
            return true;
        }
        currPath.remove(currPath.size() - 1);

        return false;
    }
}
