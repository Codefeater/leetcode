package leetcode.lesson_0_SwordOffer;

import java.util.Stack;

public class MinStack_155 {

        public Stack<Integer> imp_sk = new Stack<>();
        public Stack<Integer> aux_sk = new Stack<>();


        public void push(int x) {
            imp_sk.push(x);
            if (aux_sk.empty() || x <= getMin()) aux_sk.push(x);

        }

        public void pop() {
            if (imp_sk.peek() == getMin()) aux_sk.pop();
            imp_sk.pop();
        }

        public int top() {
            return imp_sk.peek();
        }

        public int getMin() {
            return aux_sk.peek();
        }
}
