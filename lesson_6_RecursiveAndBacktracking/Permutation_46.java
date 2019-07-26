package leetcode.lesson_6_RecursiveAndBacktracking;

import java.util.ArrayList;
import java.util.List;


public class Permutation_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> aux = new ArrayList<>();
        boolean[] momo = new boolean[nums.length + 1];
//        Arrays.fill(momo, false);
        findCombine(nums, ans, momo, 0, aux);
        return ans;
    }

    public void findCombine(int[] nums, List<List<Integer>> ans, boolean[] momo, int index, List<Integer> aux){
//        if (momo[index]) return;
        if (nums.length == index) {
            ans.add(new ArrayList<>(aux));
            return;
        }
        for (int i = 0; i < nums.length; i ++){
            if (!momo[i]){
                aux.add(nums[i]);
                momo[i] = true;
                findCombine(nums, ans, momo, index + 1, aux);
                aux.remove(new Integer(nums[i]));
                momo[i] = false;
            }
        }
    }





    public static void main(String[] args){
        Permutation_46 pt = new Permutation_46();
        int[] nums = new int[]{1,2,3};
        System.out.println(pt.permute(nums));
    }
}
