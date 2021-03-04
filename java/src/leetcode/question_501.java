package leetcode;

import java.util.ArrayList;

public class question_501 {
    public int[] findMode(TreeNode root) {
        buildFindMode(root);
        int[] res1 = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            res1[i] = res.get(i);
        }
        return res1;
    }

    ArrayList<Integer> res = new ArrayList<>();
    int cur, maxCount, count;

    public void buildFindMode(TreeNode root) {
        if (root == null) {
            return;
        }
        buildFindMode(root.left);
        // 二叉搜索树中序遍历，升序数组
        if (maxCount == 0) {
            cur = root.val;
            count = 1;
            maxCount = 1;
            res.add(cur);
        }
        if (cur != root.val) {
            cur = root.val;
            count = 1;
        }
        if (cur == root.val) {
            count++;
            if (count == maxCount) {
                res.add(root.val);
            } else if (count > maxCount) {
                res.clear();
                res.add(root.val);
                maxCount = count;
            }
        }
        buildFindMode(root.right);
    }
}
