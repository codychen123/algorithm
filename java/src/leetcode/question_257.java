package leetcode;

import java.util.ArrayList;

public class question_257 {
    public ArrayList<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<>();
        build(root, "");
        return res;
    }
    public ArrayList<String> res = new ArrayList<>();
    public void build(TreeNode root, String sb) {
        if (root == null) {
            return;
        }
        sb += root.val;
        if (root.left == null && root.right == null) {
            res.add(sb.toString());
        }
        build(root.left, sb +"->");
        build(root.right, sb + "->");
    }
}
