package leetcode.lesson_4_qstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder_Iterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> sk = new Stack<>();
        while (!sk.empty() || root != null){
           while(root != null) {
               sk.add(root);
               ans.add(root.val);
               root = root.left;
           }
           root = sk.pop();
           root = root.right;
        }
        return ans;
    }
}
