package leetcode.lesson_Basic_Algrio;

import java.util.Arrays;

public class MergeSort {
    public int[] aux;

    public int[] msort(int[] nums){
        aux = new int[nums.length];

        mergers(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergers(int[] nums, int lo, int hi){
        if (hi <= lo) return;
        int mid = (hi - lo)/2 + lo;
        mergers(nums, lo, mid);
        mergers(nums, mid + 1, hi);
        merge(nums, lo, mid, hi);
    }

    public void merge(int[] nums, int lo, int mid, int hi){
        // the for iterative here
        for (int i = 0; i < nums.length; i ++){
            aux[i] = nums[i];
        }
       int i = lo, j = mid + 1;

       for (int k = lo; k <= hi; k ++){
           if (i > mid) nums[k] = aux[j++];
           else if (j > hi) nums[k] = aux[i++];
           else if (aux[i] > aux[j]) nums[k] = aux[j++];
           else nums[k]  = aux[i ++];
       }
    }

    public static void main(String[] args){
        MergeSort ms = new MergeSort();

        int[] nums = {14, 8, 5, 4, 9};
        System.out.println(Arrays.toString(ms.msort(nums)));
    }
}
