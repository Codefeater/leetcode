package leetcode.lesson_4_qstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Inorder_Iterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> sk = new Stack<>();
        while (root != null || !sk.empty()) {
            while (root != null) {
                sk.add(root);
                root = root.left;
            }
            root = sk.pop();
            /* pop记录数据，到底 */
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
}
