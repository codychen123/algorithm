package leetcode;

public class question_606 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        root.left = root2;
        root2.right = root4;
        root.right = root3;
        //1(2(4))(3)
        question_606 q = new question_606();
        System.out.println(q.tree2str(root));
    }
    public StringBuilder res = new StringBuilder();
    public String tree2str(TreeNode t) {
        buildTree2str(t);
        return res.toString();
    }
    // 构建一个节点，左节点为空使用()代替，右节点为空，不处理
    public void buildTree2str(TreeNode t) {
        if (t == null) {
            return;
        }
        res.append(t.val);

        if (t.left != null || t.right != null) {
            res.append('(');
            buildTree2str(t.left);
            res.append(')');
        }

        if (t.right != null) {
            res.append('(');
            buildTree2str(t.right);
            res.append(')');
        }
    }
}
