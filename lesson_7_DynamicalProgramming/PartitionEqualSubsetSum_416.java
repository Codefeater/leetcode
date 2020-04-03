package leetcode.lesson_7_DynamicalProgramming;

import java.util.Arrays;

public class PartitionEqualSubsetSum_416 {
    private int[][] memo;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
//        边界判断
        if (sum % 2 != 0) return false;
//        声明记录数组，DP经典套路
        memo = new int[nums.length][sum / 2 + 1];
        for (int i = 0; i < nums.length; i++) Arrays.fill(memo[i], -1);
//        调用核心函数返回是否满足题目要求的字符
        return tryPartition(nums, nums.length - 1, sum / 2);
    }

    private boolean tryPartition(int[] nums, int index, int sum) {
        if (sum == 0) return true;
        if (sum < 0 || index < 0) return false;
        if (memo[index][sum] != -1) return memo[index][sum] == 1;

        memo[index][sum] = tryPartition(nums, index - 1, sum)
                || tryPartition(nums, index - 1, sum - nums[index]) ? 1 : 0;
        return memo[index][sum] == 1;
    }
}
