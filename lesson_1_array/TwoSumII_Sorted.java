package leetcode.lesson_1_array;

import java.util.Arrays;

public class TwoSumII_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        int l  = 0;
        int r = numbers.length - 1;
        while(l < r){
            int two = numbers[l] + numbers[r];
            if (two == target) return new int[]{l,r};
            if (two < target) l = l + 1;
            if (two > target) r = r - 1;
        }
        return new int[]{0,0};
    }

    public static void main(String[] args){
        TwoSumII_Sorted bs = new TwoSumII_Sorted();
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(bs.twoSum(nums, 9)));
    }
}
