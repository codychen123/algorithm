package leetcode;

public class question_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        // 前序遍历
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
