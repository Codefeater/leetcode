class Solution {
public:
    vector<int> result;
    int solve(int idx,vector<int>& nums){
        if (idx < 0){
            return 0;
        }
        if (result[idx] >= 0){
            return result[idx];
        }
        result[idx] = max(nums[idx] + solve(idx - 2, nums),solve(idx - 1, nums));
        return result[idx];
    }
    int rob(vector<int>& nums) {
        for(int i = 0;i <= nums.size();i++){
            result.push_back(-1);
        };
        return solve(nums.size() - 1 ,nums);
    }
};
