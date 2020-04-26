package leetcode.lesson_3_linkedlist;

public class DeleteLastKNodeLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode DummyNode = new ListNode(-1);
        DummyNode.next = head;
        ListNode cur = DummyNode;
        ListNode pre = DummyNode;

        for (int i = 0; i < n; i++) cur = cur.next;

        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }

        pre.next = pre.next.next;
        return DummyNode.next;
    }
}
