package leetcode.weeklyGame.GameWeek183;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceNonIncreasing_1403 {
    public List<Integer> minSubsequence(int[] nums) {
//        声明要返回的结果
        List<Integer> res = new ArrayList<>();
        int sum = 0, culsum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (culsum <= sum) {
                sum = sum - nums[i];
                culsum = culsum + nums[i];
                res.add(nums[i]);
            } else break;
        }
        return res;
    }
}
