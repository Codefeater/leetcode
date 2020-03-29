package leetcode.lesson_7_DynamicalProgramming;

import java.util.Arrays;

public class LongestIncreasingArray_300 {
    public static void main(String[] args) {
        LongestIncreasingArray_300 lis = new LongestIncreasingArray_300();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lis.lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        int[] momo = new int[nums.length];
        Arrays.fill(momo, 1);

        int res = 0;
        // LIS(i) 表示第i个位结尾(一定是结尾数字)，最长的上升子序列
        // 题目还是比较有价值的，最大的值保存在数组中，需要遍历的时候保存，并不是数组的最后一个值
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++)
                if (nums[i] > nums[j]) momo[i] = Math.max(momo[i], momo[j] + 1);
            res = Math.max(res, momo[i]);
        }
        return res;
    }
}
