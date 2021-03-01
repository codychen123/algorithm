package leetcode;

public class question_538 {
    public TreeNode convertBST(TreeNode root) {
        return build(root);
    }

    public int sum = 0;
    public TreeNode build(TreeNode root) {
        if (root == null) {
            return null;
        }
        build(root.right);
        // 中序遍历 ，降序排列
        sum += root.val;
        root.val = sum;
        build(root.left);
        return root;
    }
}
