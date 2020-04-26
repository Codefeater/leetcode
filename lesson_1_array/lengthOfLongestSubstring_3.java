package leetcode.lesson_1_array;

public class lengthOfLongestSubstring_3 {
    public static void main(String[] args) {

        String str = "abcadc";

        lengthOfLongestSubstring_3 mss = new lengthOfLongestSubstring_3();
        System.out.println(mss.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        int[] nums = new int[256];
        int res = 0;
        int lo = -1, hi = 0;

        while (hi < s.length()) {

            if (nums[s.charAt(hi)] == 0) nums[s.charAt(hi++)]++;
            else nums[s.charAt(++lo)]--;

            res = Math.max(res, hi - lo - 1);
        }
        return res;
    }
}
