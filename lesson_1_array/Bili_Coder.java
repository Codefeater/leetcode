package lesson_1_array;

public class Bili_Coder {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int[] sarray = new int[256];
        int ans = 0;

        while (r < s.length()){
            if (r == s.length()) return ans;


            if (sarray[s.charAt(r)] == 0) sarray[s.charAt(r++)] ++;
            else sarray[s.charAt(l ++ )] --;

            ans = Math.max(ans, r - l);
        }
        return ans;
    }


    public static void main(String[] args){

        String str = "abcadc";

        Bili_Coder mss = new Bili_Coder();
        System.out.println(mss.lengthOfLongestSubstring(str));
    }
}
