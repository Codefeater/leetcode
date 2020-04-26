package leetcode.lesson_6_RecursiveAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        Combinations cs = new Combinations();

        System.out.println(cs.combine(4, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> aux = new ArrayList<>();
        findCombinations(n, ans, aux, 0, k);
        return ans;
    }

    // 求解Cnk, 当前已经找到的组合存储在c中，需要从start开始搜索新的元素
    // 题目如何思考，就是先想想流程该是什么样子，典型的回溯问题
    public void findCombinations(int n, List<List<Integer>> ans, List<Integer> aux, int index, int k) {
        if (aux.size() == k) {
            ans.add(new ArrayList<>(aux));
            return;
        }
        for (int i = index; i < n; i++) {
            aux.add(i + 1);
            findCombinations(n, ans, aux, i + 1, k);
            aux.remove(new Integer(i + 1));
        }
    }
}
