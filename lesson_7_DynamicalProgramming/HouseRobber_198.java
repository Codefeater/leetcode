package leetcode.lesson_7_DynamicalProgramming;

import java.util.Arrays;

public class HouseRobber_198 {

    public int[] momo;

    public static void main(String[] args) {
        HouseRobber_198 hr = new HouseRobber_198();
        int[] nums = {1, 2, 3, 1};
        System.out.println(hr.rob(nums));
    }

    public int rob(int[] nums) {
        momo = new int[nums.length];
        Arrays.fill(momo, -1);
        return assist(nums.length - 1, nums);
    }

    public int assist(int idx, int[] nums) {
        if (idx < 0) return 0;
        if (momo[idx] >= 0) return momo[idx];
        momo[idx] = Math.max(nums[idx] + assist(idx - 2, nums), assist(idx - 1, nums));
        return momo[idx];
    }
}
