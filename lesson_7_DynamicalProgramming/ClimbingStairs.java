package leetcode.lesson_7_DynamicalProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    public int[] momo;

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(10));
    }

    public int climbStairs(int n) {
        momo = new int[n + 1];
        Arrays.fill(momo, -1);
        return assist(n);
    }

    public int assist(int n) {

        if (n == 0 || n == 1) {
            momo[n] = 1;
            return momo[n];
        }

        if (momo[n] > -1) return momo[n];

        momo[n] = assist(n - 1) + assist(n - 2);
        return momo[n];
    }
}
