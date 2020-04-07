package leetcode.lesson_1_array;

public class FirstLastPositionSortedArr_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int leftIdx = extremeIndex(nums, target, true);
//        对无值时刻的判断
        if (leftIdx == nums.length || nums[leftIdx] != target) return res;
//        正式判断
        res[0] = leftIdx;
        res[1] = extremeIndex(nums, target, false) - 1;
        return res;
    }

    public int extremeIndex(int[] nums, int target, boolean left) {
        int lo = 0, hi = nums.length;

        while (lo < hi) {
            int mid = (hi - lo) / 2 + lo;
            if (nums[mid] > target || (left && target == nums[mid])) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}
