/**
 *Given a binary tree, return the level order traversal of its nodes' values
 */
class Solution {
public:
    vector<vector<int>> ret;
    vector<vector<int>> levelOrder(TreeNode* root) {
        buildVector (root, 0);
        return ret;
    }
    void buildVector(TreeNode* root, int depth){
        if (root == NULL) return;
        if (ret.size() == depth) ret.push_back(vector<int>());
        ret[depth].push_back(root -> val);
        buildVector(root -> left, depth + 1);
        buildVector(root -> right, depth + 1);
    }
};

/**
 *If this level does not yet exist in the output container, then we should add a new empty level.
 Then, we add the current node to the end of the current level, and recursively call the function 
 passing the two children of the current node at the next level. This algorithm is really a DFS, 
 but it saves the level information for each node and produces the same result as BFS would.
 * };
 */
class Solution {
public:
    vector<vector<int>> ret;
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        buildVec (root, 0);
        reverse(ret.begin(),ret.end());
        return ret;
    }
    void buildVec (TreeNode* root, int depth){
        if (root == NULL) return ;
        if (ret.size() == depth) ret.push_back(vector<int>());
        ret[depth].push_back(root -> val);
        buildVec(root -> left, depth + 1);
        buildVec(root -> right, depth + 1);
        
    }
};
