package leetcode;

import java.util.HashMap;

public class question_653 {
    public static void main(String[] args) {
        question_653 q = new question_653();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(0);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-4);
        root.left.right = new TreeNode(1);
//        root.right.right = new TreeNode(7);
        System.out.println(q.findTarget(root, -1));
    }
    public boolean findTarget(TreeNode root, int k) {
        buildFindTarget(root, k);
        return hasFind;
    }
    public HashMap<Integer, Integer> res = new HashMap<>();
    boolean hasFind = false;
    // 在树中寻找是否和为k
    public void buildFindTarget(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        buildFindTarget(root.left, k);
        // 二叉搜索树中序遍历，升序数组
        if (res.containsValue(root.val)) {
            hasFind = true;
            return;
        } else {
            res.put(root.val, k - root.val);
        }
        buildFindTarget(root.right, k);
    }
}
