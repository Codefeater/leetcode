package leetcode.lesson_2_dataStructure;

import java.util.HashMap;

public class TwoSum_First_leetcode {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tmp = new HashMap<>();


        for (int i = 0; i < nums.length; i ++){
            int c = target - nums[i];
            if (tmp.containsKey(c)) return new int[]{i, tmp.get(c)};
            else tmp.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
