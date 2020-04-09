package leetcode.lesson_7_DynamicalProgramming;

public class MaximumProductSubarray_152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, iMax = 1, iMin = 1;
        for (int i = 0; i < nums.length; i++) {
//            对负数进行一次转换处理
            if (nums[i] < 0) {
                int aux = iMax;
                iMax = iMin;
                iMin = aux;
            }
            iMax = Math.max(iMax * nums[i], nums[i]);
            iMin = Math.min(iMin * nums[i], nums[i]);
//            最后大小比较
            max = Math.max(max, iMax);
        }
        return max;
    }
}
