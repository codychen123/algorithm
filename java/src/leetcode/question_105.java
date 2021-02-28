package leetcode;

public class question_105 {
    public static void main(String[] args) {
        int [] preorder = {3,9,20,15,7};
        int [] inorder = {9,3,15,20,7};
        buildTree(preorder, inorder);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length - 1,inorder,0,preorder.length-1);
    }

    public static TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int inRootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                inRootIndex = i;
                break;
            }
        }
        int leftSize = inRootIndex - inStart;
        root.left = build(preorder,preStart + 1, preStart + leftSize,inorder,inStart,inRootIndex - 1);
        root.right = build(preorder,preStart + 1 + leftSize,preEnd,inorder,inRootIndex + 1,inEnd);
        return root;
    }
}
