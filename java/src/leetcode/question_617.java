package leetcode;

public class question_617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return buildMergeTrees(root1, root2);
    }
    // 根据给的两棵树，合并节点值
    public TreeNode buildMergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root1 != null && root2 == null) {
            return root1;
        }
        root1.val = root1.val + root2.val;
        root1.left = buildMergeTrees(root1.left, root2.left);
        root1.right = buildMergeTrees(root1.right, root2.right);
        return root1;
    }
}
