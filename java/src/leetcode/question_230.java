package leetcode;

import java.util.ArrayList;

public class question_230 {
    public static void main(String[] args) {
//        int[] test = {3,1,4,5,2};
//        System.out.println(kthSmallest(test, 1));
    }
    public static int kthSmallest(TreeNode root, int k) {
//        ArrayList<int> treeVal = new ArrayList<int>();
//        buildArray(root);
//        return treeVal(k - 1);
        return 1;
    }

    public static ArrayList<Integer> treeVal = new ArrayList<Integer>();

    public static void buildArray(TreeNode root) {
        if (root == null) {
            return;
        }
        buildArray(root.left);
        // 中序遍历,二叉搜索树升序
        if (root != null) {
            treeVal.add(root.val);
        }
        buildArray(root.right);
    }
}
