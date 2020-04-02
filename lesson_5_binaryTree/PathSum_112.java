package leetcode.lesson_5_binaryTree;

public class PathSum_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.right == null && root.left == null) return root.val == sum;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
