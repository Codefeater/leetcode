/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
*/


bool hasPathSum(TreeNode *root, int sum) {
        if (root == NULL){
                return false;
        }
        if (root->val == sum && root->left ==  NULL && root->right == NULL) return true;
        return hasPathSum(root->left, sum-root->val) || hasPathSum(root->right, sum-root->val);
    }
/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
-----------------------------------------BackTracking-------------------------------------------------
*/
class Solution {
public:
    vector<vector<int>> pathSum(TreeNode* root, int sum) {
        vector<vector<int>> paths;
        vector<int> path;
        findPaths(root, sum, path, paths);
        return paths;
    }
    void findPaths(TreeNode* node, int sum, vector<int>& path, vector<vector<int>>& paths){
        if (!node) return;
        path.push_back(node -> val);
        if (!(node -> left) && !(node -> right) && sum == node -> val) paths.push_back(path);
        findPaths(node -> left, sum - node -> val, path, paths);
        findPaths(node -> right, sum - node -> val, path,paths);
        path.pop_back();
    }
};

/*
Find the number of paths that sum to a given value.
*/
class Solution {
public:
    int pathSum(TreeNode* root, int sum) {
        if (root == NULL) return 0;
        return findPath(root, sum) + pathSum(root -> left, sum) + pathSum(root -> right, sum);
    }
    
    int findPath(TreeNode* root, int sum){
        int res = 0;
        if (root == NULL) return res;
        if (sum == root.val) res ++;
        res += findPath(root -> left, sum - root -> val);
        res += findPath(root -> right, sum - root ->val);
        return res;
    }
};
