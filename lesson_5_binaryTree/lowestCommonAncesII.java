package leetcode.lesson_5_binaryTree;

public class lowestCommonAncesII {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;

        if (ancestor(root.left, p) && ancestor(root.left, q)){
            return lowestCommonAncestor(root.left, p, q);
        }
        if (ancestor(root.right, p) && ancestor(root.right, q)){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public boolean ancestor(TreeNode root, TreeNode p){

        if (root == null) return false;
        if (root == p) return true;
        if (root.right == null && root.left == null) return false;
        if (root.left == p || root.right == p) return true;

        return ancestor(root.left, p) || ancestor(root.right, p);
    }
}
