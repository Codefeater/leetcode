package leetcode.lesson_1_array;

public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int area = 0, lo = 0, hi = height.length - 1, min_height = 0;
        while (lo < hi) {
            min_height = Math.min(height[lo], height[hi]);
            area = Math.max(area, min_height * (hi - lo));
            if (height[lo] < height[hi]) lo++;
            else hi--;
        }

        return area;
    }
}
