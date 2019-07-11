package leetcode.lesson_2_dataStructure;

import java.util.HashSet;

public class Set_Lesson {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();
        for (int i = 0; i < nums1.length; i ++){
            set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j ++){
            if(set.contains(nums2[j])) inter.add(nums2[j]);
        }

        int[] ans = new int[inter.size()];

        int j = 0;
        for (Integer i : inter){
            ans[j++] = i;
        }
        return ans;
    }
}
