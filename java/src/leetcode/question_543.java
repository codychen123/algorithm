package leetcode;

public class question_543 {
    public static void main(String[] args) {
        question_543 q = new question_543();
        TreeNode root = new TreeNode(1);
        System.out.println(q.diameterOfBinaryTree(root));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        buildDiameterOfBinaryTree(root);
        return max;
    }
    int max = 0;
    public int buildDiameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = buildDiameterOfBinaryTree(root.left);
        int right = buildDiameterOfBinaryTree(root.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }
}
