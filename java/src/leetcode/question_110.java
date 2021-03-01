package leetcode;

public class question_110 {
    public boolean isBalanced(TreeNode root) {
        return buildIsBalanced(root);
    }

    public boolean buildIsBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(buildMaxDepth(root.left) - buildMaxDepth(root.right)) <= 1 && buildIsBalanced(root.left) && buildIsBalanced(root.right);
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
