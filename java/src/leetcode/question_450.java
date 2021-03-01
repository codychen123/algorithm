package leetcode;

public class question_450 {
    public static TreeNode deleteNode(TreeNode root, int key) {
        return build(root, key);
    }

    public static TreeNode build(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null && root.right != null) {
                return root.right;
            }
            if (root.left != null && root.right == null) {
                return root.left;
            }
            if (root.left != null && root.right != null) {
                TreeNode minNode = getMin(root.right);
                root.val = minNode.val;
                root.right = build(root.right, minNode.val);
            }
        }
        if (root.val < key) {
            root.right = build(root.right, key);
        }
        if (root.val > key) {
            root.left = build(root.left, key);
        }
        return root;
    }

    public static TreeNode getMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
