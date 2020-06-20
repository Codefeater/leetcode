package leetcode.weeklyGame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findLeastNumOfUniqueInts_1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int size = map.size();
        int[] cnt = new int[size];
        int m = 0;
        for (int key : map.keySet()) {
            cnt[m ++ ] = map.get(key);
        }
        Arrays.sort(cnt);
        for (int c : cnt) {
            if (k >= c) {
                k = k -c;
                size --;
            } else break;
        }
        return size;
    }
}
