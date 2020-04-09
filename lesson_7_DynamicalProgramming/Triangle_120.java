package leetcode.lesson_7_DynamicalProgramming;

import java.util.List;

public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
//        自底向上遍历
        int[] moho = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--)
            for (int j = 0; j < triangle.get(i).size(); j++)
                moho[j] = Math.min(moho[j], moho[j + 1]) + triangle.get(i).get(j);
        return moho[0];
    }
}
