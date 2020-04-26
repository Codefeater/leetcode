package leetcode.lesson_Basic_Algrio;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 2, 4, 5, 6, 10};
        QuickSort qs = new QuickSort();
        System.out.println(Arrays.toString(qs.qsort(nums)));
    }

    public void exch(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public int[] qsort(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quicksort(int[] nums, int lo, int hi) {
        if (lo >= hi) return;
        int k = partition(nums, lo, hi);
        quicksort(nums, lo, k - 1);
        quicksort(nums, k + 1, hi);
    }

    public int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (nums[++i] <= v) if (i >= hi) break;
            while (nums[--j] >= v) if (j <= lo) break;
            if (i >= j) break;
            exch(nums, i, j);
        }
        exch(nums, lo, j);
        return --i;
    }
}
