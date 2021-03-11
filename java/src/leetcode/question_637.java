package leetcode;

import java.util.ArrayList;

public class question_637 {
    public ArrayList<Double> averageOfLevels(TreeNode root) {
        ArrayList<Integer> counts = new ArrayList<>();
        ArrayList<Double> sums = new ArrayList<>();
        ArrayList<Double> avgs = new ArrayList<>();
        buildAverage(root, 0, counts, sums);
        int size = counts.size();
        for (int i = 0; i < size; i++) {
            avgs.add(sums.get(i)/counts.get(i));
        }
        return avgs;
    }
    // 算出单层的节点数和单层总和
    public void buildAverage(TreeNode root, int level, ArrayList<Integer> counts, ArrayList<Double> sums) {
        if (root == null) {
            return;
        }
        if (level < counts.size()) {
            sums.set(level, sums.get(level) + root.val);
            counts.set(level, counts.get(level) + 1);
        } else {
            sums.add(root.val * 1.0);
            counts.add(1);
        }
        buildAverage(root.left, level + 1, counts, sums);
        buildAverage(root.right, level + 1, counts, sums);
    }
}
