public class PseudoPalindromicPaths {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(3, new TreeNode(3), new TreeNode(1));
        TreeNode right = new TreeNode(1, null, new TreeNode(1));
        TreeNode node = new TreeNode(2, left, right);
        System.out.println(pseudoPalindromicPaths(node));
    }

    public static int pseudoPalindromicPaths (TreeNode root) {
        return iterate(root, new int[9]);
    }

    private static int iterate(TreeNode node, int[] freq) {
        if (node != null) {
            freq[node.val - 1] += 1;

            if (node.left == null && node.right == null) {
                boolean containsOdd = false;
                for (int f : freq) {
                    if (f % 2 == 1) {
                        if (containsOdd) {
                            return 0;
                        } else {
                            containsOdd = true;
                        }
                    }
                }
                return 1;
            }

            int[] freqLeft = new int[9];
            int[] freqRight = new int[9];
            System.arraycopy(freq, 0, freqLeft, 0, freq.length);
            System.arraycopy(freq, 0, freqRight, 0, freq.length);
            return iterate(node.left, freqLeft) + iterate(node.right, freqRight);
        }
        return 0;
    }
}
