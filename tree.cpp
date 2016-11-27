class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        if (root == NULL){
            return NULL;
        }
        invertTree(root->left);
        invertTree(root->right);
        
        TreeNode *r = root->right, *l = root->left;
        root->right = l;
        root->left = r;
        return root;
    }
};
/*------------------------------------------------------------------------------*/
class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        return root == NULL || isSymmetricHelp(root -> left, root -> right);
    }
    bool isSymmetricHelp(TreeNode *left, TreeNode *right){
        if (left == NULL || right == NULL) return left == right;
        if (left -> val != right -> val) return false;
        return isSymmetricHelp(left -> left, right -> right) && isSymmetricHelp(left -> right, right -> left);
    }
};
