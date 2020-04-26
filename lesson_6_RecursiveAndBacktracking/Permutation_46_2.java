package leetcode.lesson_6_RecursiveAndBacktracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation_46_2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> aux = new ArrayList<>();

        for (int num : nums) aux.add(num);

        int n = nums.length;
        backtrack(n, aux, ans, 0);
        return ans;
    }

    public void backtrack(int n, List<Integer> aux, List<List<Integer>> ans, int idx) {
        if (idx == n) ans.add(new ArrayList<>(aux));

        for (int i = idx; i < n; i++) {
            Collections.swap(aux, idx, i);

            backtrack(n, aux, ans, idx + 1);

            Collections.swap(aux, idx, i);
        }
    }
}
