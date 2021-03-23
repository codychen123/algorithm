package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class question_95 {
    public static void main(String[] args) {
        question_95 q = new question_95();
        System.out.println(q.generateTrees(3).toString());;
    }

    public ArrayList<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }
        return generateTrees(1,n);
    }

    public ArrayList<TreeNode> generateTrees(int start, int end) {
        LinkedList<TreeNode> res = new LinkedList<>();
        if (start > end) {
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i++) {
            ArrayList<TreeNode> leftRes = generateTrees(start, i - 1);
            ArrayList<TreeNode> rightRes = generateTrees(i + 1, end);
            for (TreeNode left : leftRes) {
                for (TreeNode right : rightRes) {
                    TreeNode currTree = new TreeNode(i);
                    currTree.left = left;
                    currTree.right = right;
                    res.add(currTree);
                }
            }

        }
        return res;
    }
}
