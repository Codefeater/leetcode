package leetcode.lesson_6_RecursiveAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PhoneCombination {
    private static String[] letterMap = {
            " ",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };


    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() <= 0) return ans;

        findCombinations(digits, 0, ans, "");

        return ans;
    }


    public void findCombinations(String digits, int index, List<String> ans, String bub){
        if (digits.length() == index) {
            ans.add(bub);
            return;
        }

        int sz = digits.charAt(index) - '0';
        for (int i = 0; i < letterMap[sz].length(); i ++){
            findCombinations(digits, index + 1, ans, bub + letterMap[sz].charAt(i));
        }
    }

    public static void main(String[] args) {
        PhoneCombination pc = new PhoneCombination();
        System.out.println(pc.letterCombinations("3456"));
    }
}
