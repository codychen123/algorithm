package leetcode;

public class question_98 {
    public boolean isValidBST(TreeNode root) {
        return isBuildValidBST(root, null, null);
    }
    public boolean isBuildValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val) {
            return false;
        }
        if (max != null && root.val >= max.val) {
            return false;
        }
        return isBuildValidBST(root.left, min , root) && isBuildValidBST(root.right, root, max);
    }
}
