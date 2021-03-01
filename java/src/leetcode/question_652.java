package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class question_652 {
    public static void main(String[] args) {

        System.out.println();
    }

    public static HashMap<String, Integer> temp = new HashMap<>();
    public static ArrayList<TreeNode> res = new ArrayList<>();

    public static ArrayList<TreeNode> findDuplicateSubtrees(TreeNode root) {
        build(root);
        return res;
    }

    public static String build(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String left = build(root.left);
        String right = build(root.right);
        String subTreeString = left + ',' + right + ',' + root.val;
        //
        Integer num = temp.getOrDefault(subTreeString,0);
        if (num == 1) {
            res.add(root);
        }
        temp.put(subTreeString,num + 1);
        return subTreeString;
    }
}
