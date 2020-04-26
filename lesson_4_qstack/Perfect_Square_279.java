package leetcode.lesson_4_qstack;

import java.util.Arrays;

public class Perfect_Square_279 {
    public int numSquares(int n) {
        int[] nums = new int[n + 1];
        Arrays.fill(nums, n + 1);
        nums[0] = 1;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (i - j * j >= 0) {
                if (i - j * j > 0) nums[i] = Math.min(nums[i - j * j] + nums[j * j], nums[i]);
                else nums[i] = 1;
                j++;
            }
        }
        return nums[n];
    }
}
