package leetcode;

public class minimum_height_tree_lcci {
    //若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length);
    }

    public TreeNode helper(int[] nums, int low, int high) {
        if (low == high) {
            return null;
        }
        //以mid作为根节点
        int mid = (high - low)/2 + low;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, low, mid);
        root.right = helper(nums, mid+1, high);
        return root;
    }
}
