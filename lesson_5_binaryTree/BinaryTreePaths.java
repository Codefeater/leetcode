package leetcode.lesson_5_binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root.right == null && root.left == null) {
            ans.add("" + root.val);
            return ans;
        }

        List<String> lefts = binaryTreePaths(root.left);
        for (int i = 0; i < lefts.size(); i ++){
            ans.add(root.val + "->" + lefts.get(i));
        }

        List<String> rights = binaryTreePaths(root.right);
        for (int i = 0; i < rights.size(); i ++){
            ans.add(root.val + "->" + rights.get(i));
        }
        return ans;
    }

}
