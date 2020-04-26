package leetcode.lesson_5_binaryTree;

public class PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int res = findPath(root, sum);
        res += pathSum(root.left, sum);
        res += pathSum(root.right, sum);
        return res;
    }

    public int findPath(TreeNode root, int sum) {
        if (root == null) return 0;
        int res = 0;
        if (root.val == sum) res += 1;

        res += findPath(root.left, sum - root.val);
        res += findPath(root.right, sum - root.val);
        return res;
    }
}
