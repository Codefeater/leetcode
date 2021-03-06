package leetcode.lesson_1_array;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9};
        System.out.println(bs.search(nums, 9));
    }

    public int search(int[] nums, int targrt) {
        int right = 0;
        int left = nums.length - 1;


        while (right <= left) {
            int mid = (right + left) / 2;
            if (nums[mid] == targrt) {
                return mid;
            }

            if (nums[mid] > targrt) left = mid - 1;
            else right = mid + 1;
        }
        return -1;
    }
}
