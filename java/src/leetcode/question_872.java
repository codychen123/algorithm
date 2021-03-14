package leetcode;

import java.util.ArrayList;

public class question_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        buildLeafSimilar(root1,arr1);
        buildLeafSimilar(root2,arr2);
        boolean isSimilar = true;
        if (arr1.size() != arr2.size()) {
            isSimilar = false;
        } else {
            for (int i = 0; i< arr1.size(); i++) {
                if (arr1.get(i) != arr2[i]) {
                    isSimilar = false;
                    break;
                }
            }
        }
        return isSimilar;
    }
    public void buildLeafSimilar(TreeNode root, ArrayList <Integer> arr) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            arr.add(root.val);
        }
        buildLeafSimilar(root.left, arr);
        buildLeafSimilar(root.right, arr);
    }
}
