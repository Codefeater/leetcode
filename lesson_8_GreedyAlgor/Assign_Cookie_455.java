package lesson_8_GreedyAlgor;

import java.util.Arrays;

public class Assign_Cookie_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1;
        int j = s.length - 1;
        int ans = 0;

        while (i >= 0 && j >= 0) {
            if (g[i] <= s[j]) {
                ans++;
                j--;
            }
            ;
            i--;
        }
        return ans;
    }

    public static void main(String[] args){
        Assign_Cookie_455 ac = new Assign_Cookie_455();
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(ac.findContentChildren(g,s));
    }
}
