package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class question_297 {
    public static void main(String[] args) {

    }
    // Encodes a tree to a single string.
    public StringBuilder sb;
    String sep = ",";
    String NullNode = "#";
    public String serialize(TreeNode root) {
        sb = new StringBuilder();
        return buildSerialize(root);
    }

    public String buildSerialize(TreeNode root) {
        if (root == null) {
            sb.append(NullNode).append(sep);
            return sb.toString();
        }
        sb.append(root.val).append(sep);
        buildSerialize(root.left);
        buildSerialize(root.right);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> nodeNum = new LinkedList<String>();
        for (String s:data.split(sep)) {
            nodeNum.add(s);
        }
        return buildDeserialize(nodeNum);
    }

    public TreeNode buildDeserialize(LinkedList<String> nodeNum) {
        if (nodeNum.isEmpty()) {
            return null;
        }
        String numStr = nodeNum.removeFirst();
        if (numStr.equals(NullNode)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(numStr));
        root.left = buildDeserialize(nodeNum);
        root.right = buildDeserialize(nodeNum);
        return root;
    }
}
