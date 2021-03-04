package leetcode;

public class question_530 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(3);
        root.right = root1;
        root1.left = root2;
        question_530 q = new question_530();
        System.out.println(q.getMinimumDifference(root));
    }

    public int getMinimumDifference(TreeNode root) {
        buildGetMinimumDifference(root);
        return res;
    }
    int pre = -1, res = Integer.MAX_VALUE;
    public void buildGetMinimumDifference(TreeNode root) {
        if (root == null) {
            return;
        }
        buildGetMinimumDifference(root.left);
        // 二叉搜索树，中序遍历，升序结果
        if (pre != -1) {
            res = Math.abs(root.val - pre) < res ? Math.abs(root.val - pre) : res;
        }
        pre = root.val;
        buildGetMinimumDifference(root.right);
    }
}
