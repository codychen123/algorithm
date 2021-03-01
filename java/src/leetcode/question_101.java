package leetcode;

public class question_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return buildIsSymmetric(root.left, root.right);
    }

    public boolean buildIsSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if ((left == null && right != null) || (left != null && right == null) || (left.val != right.val)) {
            return false;
        }
        return buildIsSymmetric(left.left, right.right) && buildIsSymmetric(left.right, right.left);
    }
}
