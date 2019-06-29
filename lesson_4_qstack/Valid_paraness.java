package lesson_4_qstack;

import java.util.Stack;

public class Valid_paraness {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack();
        for (int i = 0; i < s.length(); i ++){
            if (sk.empty()) sk.add(s.charAt(i));
            else if (s.charAt(i) == ']' && sk.peek() =='[') sk.pop();
            else if (s.charAt(i) == ')' && sk.peek() =='(') sk.pop();
            else if (s.charAt(i) == '}' && sk.peek() =='{') sk.pop();
            else sk.add(s.charAt(i));
        }
        return sk.empty();
    }

    public static void main(String[] args){
        Valid_paraness vp = new Valid_paraness();
        System.out.println(vp.isValid("()"));
    }

}
