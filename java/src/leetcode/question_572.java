package leetcode;

public class question_572 {
    public static void main(String[] args) {
        TreeNode s = new TreeNode(4);
        s.left = new TreeNode(1);
        s.right = new TreeNode(2);
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(4);
        t.right = new TreeNode(5);
        t.left.left = new TreeNode(1);
        t.left.right = new TreeNode(2);
        question_572 q = new question_572();
        boolean isSub = q.isSubtree(s, t);
        System.out.println(isSub);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        if (t == null) {
            return true;
        }
        // 验证目标树t与根树s、根左子树、根右子树
        return buildIsSubtree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    // 找出节点t和s值相同，并且子树结点值一样
    public boolean buildIsSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (t == null || s == null || s.val != t.val) {
            return false;
        }
        return buildIsSubtree(s.left, t.left) && buildIsSubtree(s.right, t.right);
    }
}
