package leetcode.lesson_0_SwordOffer;

public class StringtoInteger_8 {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0;

        int idx = 0, ans = 0, sign = 1;
        while (idx < str.length() && str.charAt(idx) == ' ') idx ++;
        if (idx == str.length()) return ans;


        if (str.charAt(idx) == '+' || str.charAt(idx) == '-') sign = (str.charAt(idx ++) == '+' ? 1: -1);
        for (int i = idx; i < str.length(); i ++){
            int digit = str.charAt(i) - '0';
            if (digit < 0 || digit > 9) break;
            if (Integer.MAX_VALUE/10 < ans || Integer.MAX_VALUE/10 == ans && Integer.MAX_VALUE%10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            ans = 10*ans + digit;
        }
        return sign*ans;
    }

    public static void main(String[] args){
        StringtoInteger_8 sto = new StringtoInteger_8();
        System.out.println(sto.myAtoi("-2147483648"));

    }
}
