package leetcode.lesson_7_DynamicalProgramming;

import java.util.Arrays;

public class Knaspack_01 {
    public int[][] momo;
    public int kspack(int[] w, int[] v, int C){
        momo = new int[w.length][C + 1];
        Arrays.fill(momo,-1);
        return assist(0, w, v, C, momo);
    }

    public int assist(int idx, int[] w, int[] v, int C, int[][] momo){
        if  (idx <0 || C <= 0) return 0;

        if(momo[idx][C] != -1) return momo[idx][C];
        int res = assist(idx - 1, w, v, C, momo);
        if (C >= w[idx])
            res = Math.max(res, v[idx] + assist(idx - 1, w, v,C-w[idx], momo));
        momo[idx][C] = res;
        return res;
    }
}
