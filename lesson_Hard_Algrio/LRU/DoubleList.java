package leetcode.lesson_Hard_Algrio.LRU;

public class DoubleList {
    private final Node head;
    private final Node tail;
    private int size;

    public DoubleList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public void addFirst(Node x) {
        x.next = head.next;
        x.prev = head;
        head.next.prev = x;
        head.next = x;
        size++;
    }

    //    依赖自身删除自身
    public void remove(Node x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }

    public Node removeLast() {
        if (tail.prev == head) return null;
        Node last = tail.prev;
        remove(last);
        return last;
    }

    public int size() {
        return size;
    }
}
