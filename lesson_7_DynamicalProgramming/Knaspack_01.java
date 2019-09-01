package leetcode.lesson_7_DynamicalProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class Knaspack_01 {
    public int[][] momo;
    // recursive way
    public int kspack(int[] w, int[] v, int C){
        momo = new int[w.length][C + 1];
        Arrays.fill(momo,-1);
        return assist(0, w, v, C, momo);
    }

    public int assist(int idx, int[] w, int[] v, int C, int[][] momo){
        if  (idx < 0 || C <= 0) return 0;

        if(momo[idx][C] != -1) return momo[idx][C];
        int res = assist(idx - 1, w, v, C, momo);
        if (C >= w[idx])
            res = Math.max(res, v[idx] + assist(idx - 1, w, v,C-w[idx], momo));
        momo[idx][C] = res;
        return res;
    }

    // iterative ways
    public int kspack_iter(int[] w, int[] v, int C){
        int n = w.length;
        int[][] memo = new int[w.length][C + 1];
        Arrays.fill(memo, -1);

        for (int j = 0; j <= C; j ++){
            memo[0][j] = ( j >= w[0] ? w[0] : 0);
        }

        for (int i = 1; i < n; i ++ ){
            for (int j = 0; j <= C; j ++){
                memo[i][j] = memo[i - 1][j];
                if (j >= w[i])
                    memo[i][j] = Math.max(memo[i][j], v[i] + memo[i - 1][j - w[i]]);
            }
        }
        return memo[n - 1][C];
    }
}
