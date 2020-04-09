package leetcode.lesson_7_DynamicalProgramming;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int ans = Integer.MIN_VALUE, maxed = 0;
        for (int i = 0; i < nums.length; i++) {
            maxed = Math.max(maxed + nums[i], nums[i]);
            ans = Math.max(ans, maxed);
        }
        return ans;
    }
}
