package leetcode;

public class question_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.right == null || root.left == null) {
            return left + right + 1;
        }
        return Math.min(left, right) + 1;
    }
}
