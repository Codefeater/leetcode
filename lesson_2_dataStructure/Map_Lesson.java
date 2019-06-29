package lesson_2_dataStructure;

import java.util.ArrayList;
import java.util.HashMap;

public class Map_Lesson {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i ++){
            if (map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i]) + 1);
            else map.put(nums1[i], 1);
        }

        for (int i = 0; i < nums2.length; i ++){
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0 ){
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] ans = new int[result.size()];

        int j = 0;
        for (Integer i : result){
            ans[j ++] = i;
        }

        return ans;
    }
}
