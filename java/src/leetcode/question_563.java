package leetcode;

public class question_563 {
    public int findTilt(TreeNode root) {
        buildFindTilt(root);
        return res;
    }
    int res = 0;
    public int buildFindTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = buildFindTilt(root.left);
        int right = buildFindTilt(root.right);
        res += Math.abs(left - right);
        return left + right + root.val;
    }
}
