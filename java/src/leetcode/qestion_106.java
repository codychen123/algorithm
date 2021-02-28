package leetcode;

public class qestion_106 {
    public static void main(String[] args) {
        int [] inorder = {9,3,15,20,7};
        int [] postorder = {9,15,7,20,3};
        buildTree(inorder, postorder);
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0,inorder.length - 1,postorder,0,postorder.length-1);
    }

    public static TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        int inRootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                inRootIndex = i;
                break;
            }
        }
        int leftSize = inRootIndex - inStart;
        root.left = build(inorder, inStart, inRootIndex -1 ,postorder,postStart,postStart + leftSize - 1);
        root.right = build(inorder,inRootIndex + 1,inEnd,postorder, postStart + leftSize,postEnd - 1);
        return root;
    }
}
