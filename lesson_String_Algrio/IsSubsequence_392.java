package leetcode.lesson_String_Algrio;

public class IsSubsequence_392 {
    //   判断s是否是t子串
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) return false;

        int m = s.length(), n = t.length();
        int i = 0, j = 0;

        while (j < n) {
            if (s.charAt(i) == s.charAt(j)) i++;
            j++;
        }
        return i == m;
    }
}
