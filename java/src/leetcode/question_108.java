package leetcode;

public class question_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildSortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode buildSortedArrayToBST(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = lo + (hi - lo)/2;
        // 二叉搜索树中序遍历，升序
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildSortedArrayToBST(nums, lo, mid - 1);
        root.right = buildSortedArrayToBST(nums, mid + 1, hi);
        return root;
    }
}
