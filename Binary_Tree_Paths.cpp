//Given a binary tree, return all root-to-leaf paths.

class Solution {
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> ans;
        if (root != NULL) BTP(root, "", ans);
        return ans;
    }
    
    void BTP(TreeNode* root, string path, vector<string>& ans){
        if (root -> left == NULL && root -> right == NULL) ans.push_back(path + to_string(root -> val));
        if (root -> left != NULL) BTP(root -> left, path + to_string(root -> val) + "->",ans);
        if (root -> right != NULL) BTP(root -> right, path + to_string(root -> val) + "->",ans);
    }
};
