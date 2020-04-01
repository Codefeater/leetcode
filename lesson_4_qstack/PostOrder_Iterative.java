package leetcode.lesson_4_qstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder_Iterative {
    List<Integer> res = new ArrayList<>();

    public static void assist(TreeNode root, List<Integer> res) {
        if (root == null) return;
        assist(root.left, res);
        assist(root.right, res);
        res.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;
        Stack<TreeNode> sk = new Stack<TreeNode>();

        sk.push(root);
        while (!sk.empty()) {
            TreeNode aux = sk.peek();
            if (aux.left == null && aux.right == null) {
                ans.add(sk.pop().val);
            } else {
                if (aux.right != null) sk.push(aux.right);
                if (aux.left != null) sk.push(aux.left);
                aux.right = null;
                aux.left = null;
            }
        }
        return ans;
    }

    public List<Integer> posterIterative(TreeNode root) {
        assist(root, res);
        return res;
    }
}