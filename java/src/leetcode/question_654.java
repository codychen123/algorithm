package leetcode;

public class question_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length);
    }
    public TreeNode build (int[] nums, int left, int right) {
        if (left > right - 1) {
            return null;
        }
        int maxVal = Integer.MIN_VALUE;
        int index = -1;
        for (int i = left; i < right; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(maxVal);
        root.left = build(nums, left, index);
        root.right = build(nums, index + 1, right);
        return root;
    }
}
