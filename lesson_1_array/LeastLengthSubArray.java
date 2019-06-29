package lesson_1_array;

public class LeastLengthSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 4, 1, 1, 2};
        int s = 10;

        LeastLengthSubArray mss = new LeastLengthSubArray();
        System.out.println(mss.minSubArrayLen(s, nums));
    }

    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = -1;
        int sum = 0;
        int ans = nums.length + 1;
        while (l < nums.length) {
            if ((sum < s) && (r + 1 < nums.length)) sum += nums[++r];
            else sum -= nums[l++];

            if (sum >= s) ans = Math.min(ans, r - l + 1);
        }
        return ans;

    }

}
