package leetcode;

public class question_116 {
    public static void main(String[] args) {

    }
    public Node connect(Node root) {
        // base case
        if (root == null || root.right == null) {
            return root;
        }
        connectTwoNode(root.left, root.right);
        return root;
    }
    void connectTwoNode (Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }
        // 前序遍历
        node1.next = node2;
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node2.left, node2.right);
        connectTwoNode(node1.right, node2.left);
    }
}
