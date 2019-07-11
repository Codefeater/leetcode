package lesson_6_RecursiveAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> aux = new ArrayList<>();
        findCombinations(n, ans, aux,0, k);
        return ans;
    }

    public void findCombinations(int n, List<List<Integer>> ans, List<Integer> aux, int index, int k){
        if (aux.size() == k){
            ans.add(new ArrayList<>(aux));
            return;
        }
        for (int i = index; i < n; i ++){
            aux.add(i + 1);
            findCombinations(n, ans, aux, i + 1, k);
            aux.remove(new Integer(i + 1));
            }
        }

    public static void main(String[] args){
        Combinations cs = new Combinations();

        System.out.println(cs.combine(4,2));
    }
}
