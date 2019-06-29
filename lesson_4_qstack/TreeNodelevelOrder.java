package lesson_4_qstack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodelevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) return ans;

        queue.offer(root);
        while (queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i ++){
                TreeNode tn = queue.poll();
                if (tn.left != null) queue.offer(tn.left);
                if (tn.right != null) queue.offer(tn.right);
                tmp.add(tn.val);
            }
            ans.add(tmp);
        }
        return ans;
    }
}
