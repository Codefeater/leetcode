package leetcode.lesson_4_qstack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodelevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> aux = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {

                TreeNode tr = queue.poll();
                aux.add(tr.val);
                if (tr.left != null) queue.offer(tr.left);
                if (tr.right != null) queue.offer(tr.right);

            }
            res.add(new ArrayList<>(aux));
        }

        return res;
    }
}
