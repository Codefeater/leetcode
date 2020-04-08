package leetcode.lesson_6_RecursiveAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII_40 {
    public static void assist(int[] nums, List<List<Integer>> res, List<Integer> aux, int target, int idx) {
        if (target == 0) {
            res.add(new ArrayList(aux));
            return;
        }
        if (target < 0 || idx >= nums.length) return;

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;
            aux.add(nums[i]);
            assist(nums, res, aux, target - nums[i], i + 1);
            aux.remove(new Integer(nums[i]));
        }
    }

    public static void main(String[] args) {
        CombinationSumII_40 cb = new CombinationSumII_40();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(cb.combinationSum2(candidates, 10).toString());
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> aux = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<>();
        assist(candidates, res, aux, target, 0);
        return res;
    }
}
