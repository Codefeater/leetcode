package leetcode.lesson_3_linkedlist;

public class RevreseLinkedList_206 {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            while (cur != null){
                ListNode tmp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = tmp;
            }
            return pre;
        }

        public ListNode reverseListRecur(ListNode head){
            if (head == null || head.next == null) return head;
            ListNode p = reverseListRecur(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }

}
