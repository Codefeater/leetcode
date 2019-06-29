package lesson_7_DynamicalProgramming;

import java.util.Arrays;

public class IntegerBreak_343 {
    public int[] momo;
    public int integerBreak(int n) {
        momo = new int[n + 1];
        Arrays.fill(momo, -1);
        return assist(n);
    }

    public int assist(int n){
        if (n == 0 || n == 1 || n==2) {
            momo[n] = 1;
            return 1;
        }

        if (momo[n] > -1) return momo[n];

        for (int i = 1; i <= n/2 + 1; i ++){
            momo[n] = Math.max(momo[n], Math.max(i * (n-i), assist(i) * assist(n - i)));
        }
        return momo[n];
    }

    public static void main(String[] args){
        IntegerBreak_343 ib = new IntegerBreak_343();
        System.out.println(ib.integerBreak(10));
    }
}
