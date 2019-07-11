package leetcode.lesson_4_qstack;

import java.util.ArrayList;
import java.util.List;

public class Inorder_Recurive {
    public List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        assist(root);
        return ans;
    }

    public void assist(TreeNode root){
        if (root == null) return;

        assist(root.left);
        ans.add(root.val);
        assist(root.right);
    }
}
