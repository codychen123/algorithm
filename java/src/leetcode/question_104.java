package leetcode;

public class question_104 {
    public int maxDepth(TreeNode root) {
        return maxDepth(root);
    }

    public int buildMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = buildMaxDepth(root.left);
        int rightHeight = buildMaxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
