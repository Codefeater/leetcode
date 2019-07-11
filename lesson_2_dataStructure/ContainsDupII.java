package leetcode.lesson_2_dataStructure;

import java.util.HashMap;

public class ContainsDupII {
    public boolean containsNearbyDuplicateI(int[] nums, int k) {
        for (int i = 0 ; i < nums.length; i ++){
            for (int j = 1; j <= k; j ++){
                if ((i + j) < nums.length && nums[i + j] == nums[i])  return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
            else map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDupII cd = new ContainsDupII();
        int[] nums = new int[]{1,2,3,1};
        int k = 3;
        System.out.println(cd.containsNearbyDuplicate(nums, k));
    }
}
