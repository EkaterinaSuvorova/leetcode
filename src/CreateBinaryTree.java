import java.util.*;
import java.util.stream.Stream;

//https://leetcode.com/problems/create-binary-tree-from-descriptions/
//2196. Create Binary Tree From Descriptions
public class CreateBinaryTree {
    public static void main(String[] args) {
        int[][] descriptions1 = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        createBinaryTree(descriptions1);
    }

    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, int[]> parentChildMap = new HashMap<>();
        Set<Integer> childSet = new HashSet<>();
        for (int[] d : descriptions) {
            int parent = d[0];
            int child = d[1];
            boolean isLeft = d[2] == 1;

            parentChildMap.putIfAbsent(parent, new int[] {-1, -1});
            childSet.add(child);
            if (isLeft) {
                parentChildMap.get(parent)[0] = child;
            } else {
                parentChildMap.get(parent)[1] = child;
            }
        }

        Optional<Integer> parentOptional = parentChildMap.keySet()
                .stream()
                .filter(p -> !childSet.contains(p))
                .findFirst();

        return parentOptional.map(parentValue -> constructTree(parentValue, parentChildMap)).orElse(null);
    }

    private static TreeNode constructTree(int nodeVal, Map<Integer, int[]> parentChildMap) {
        TreeNode node = new TreeNode(nodeVal);
        if (parentChildMap.containsKey(nodeVal)) {
            if (parentChildMap.get(nodeVal)[0] != -1) {
                node.left = constructTree(parentChildMap.get(nodeVal)[0], parentChildMap);
            }
            if (parentChildMap.get(nodeVal)[1] != -1) {
                node.right = constructTree(parentChildMap.get(nodeVal)[1], parentChildMap);
            }
        }
        return node;
    }
}
