package leetcode;

public class question_124 {
    public int maxPathSum(TreeNode root) {
        buildMaxPathSum(root);
        return res;
    }
    public int res = Integer.MIN_VALUE;
    // 返回单颗数中最大路径
    public int buildMaxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, buildMaxPathSum(root.left));
        int right = Math.max(0, buildMaxPathSum(root.right));
        res = Math.max(res, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
