package leetcode.lesson_7_DynamicalProgramming;

public class CombinationSumIV_377 {
    //    comb[target] = sum(comb[target - nums[i]]), where 0 <= i < nums.length, and target >= nums[i].
//    虽然看起来是个backtracking题目，其实是个dp问题
    public int combinationSum4(int[] nums, int target) {
        int[] comb = new int[target + 1];
        comb[0] = 1;
        for (int i = 0; i < comb.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] >= 0) {
                    comb[i] = comb[i] + comb[i - nums[j]];
                }
            }
        }
        return comb[target];
    }
}
