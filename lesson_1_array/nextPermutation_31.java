package leetcode.lesson_1_array;

public class nextPermutation_31 {
    public void nextPermutation(int[] nums) {
        int min_idx = -1, max_idx = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) min_idx = Math.max(min_idx, i);
        }
//        首先处理的是极端情况
        if (min_idx == -1 || min_idx == nums.length) {
            swap(nums, 0);
            return;
        }
//        之后处理正常的情况，获取最大的idx
        for (int j = min_idx + 1; j < nums.length; j++) {
            if (nums[min_idx] < nums[j]) max_idx = Math.max(max_idx, j);
        }
        exch(nums, min_idx, max_idx);
        swap(nums, min_idx + 1);
    }

    //    剩下是两个函数的TODO, 辅助函数
    public void exch(int[] nums, int lo, int hi) {
        int tmp = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = tmp;
    }

    public void swap(int[] nums, int min_idx) {
        int i = min_idx, j = nums.length - 1;
        while (i < j) {
            exch(nums, i++, j--);
        }
    }
}
