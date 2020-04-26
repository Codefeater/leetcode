package leetcode.lesson_Hard_Algrio.LRU;

import java.util.HashMap;

public class LRUCache_146 {
    //    core idea: map(k, node), doubleList(node)
    private final HashMap<Integer, Node> map;
    private final DoubleList cache;
    private final int cap;

    public LRUCache_146(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    //    core part1
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        int val = map.get(key).val;
        put(key, val);
        return val;
    }

    //    core part2
    public void put(int key, int val) {
        Node x = new Node(key, val);
        if (map.containsKey(key)) {
            cache.remove(map.get(key));
        } else {
            if (cap == cache.size()) {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
        }
        cache.addFirst(x);
        map.put(key, x);
    }
}
