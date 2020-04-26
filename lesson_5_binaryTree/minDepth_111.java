package leetcode.lesson_5_binaryTree;

public class minDepth_111 {
    public int minDepth(TreeNode root) {
        int ans = assist(root);
        return ans;
    }

    public int assist(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) min_depth = Math.min(min_depth, assist(root.left));
        if (root.right != null) min_depth = Math.min(min_depth, assist(root.right));
        return min_depth + 1;
    }
}
