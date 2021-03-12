package leetcode;

import java.util.ArrayList;

public class question_671 {
    public static void main(String[] args) {
        question_671 q = new question_671();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2147483647);
        System.out.println(q.findSecondMinimumValue(root));
    }
    public int findSecondMinimumValue(TreeNode root) {
        buildFindSecondMinimumValue(root, root.val);
        if (res > root.val) {
            return res;
        }
        return -1;
    }
    public int res = Integer.MAX_VALUE;
    // 返回某颗树左右节点的最小值
    public void buildFindSecondMinimumValue(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        buildFindSecondMinimumValue(root.left, val);
        buildFindSecondMinimumValue(root.right, val);
        if (root.val != val) {
            res = Math.min(res, root.val);
        }
    }
}
