package leetcode.lesson_3_linkedlist;

public class SwapNodePairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode cur = dummyHead;
        while (cur.next != null && cur.next.next != null) {
            ListNode next = cur.next;
            ListNode curN = cur.next.next.next;

            cur.next = cur.next.next;
            cur = cur.next;
            cur.next = next;
            cur = cur.next;
            cur.next = curN;

        }
        return dummyHead.next;
    }
}
