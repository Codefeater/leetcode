package leetcode.lesson_4_qstack;

import java.util.ArrayList;
import java.util.List;

public class PreOrder_Recurive {
    public List<Integer> ans = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        assist_Pre(root);
        return ans;
    }

    private void assist_Pre(TreeNode root) {
        if(root == null) return;
        ans.add(root.val);
        assist_Pre(root.left);
        assist_Pre(root.right);
    }
}
