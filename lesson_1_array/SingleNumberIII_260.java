package leetcode.lesson_1_array;

public class SingleNumberIII_260 {
    //    辅助函数，第几位存在问题
    public static int getIndex(int miniArr) {
        int indexBit = 0;
        while ((miniArr & 1) == 0) {
            miniArr = miniArr >> 1;
            ++indexBit;
        }
        return indexBit;
    }

    //    辅助函数，判断将数组分流
    public static boolean IsBit(int num, int Index) {
        num = num >> Index;
        return (num & 1) == 1;
    }

    public int[] singleNumber(int[] nums) {
//        定位到元素
        int diff = 0;
        for (int num : nums) diff = diff ^ num;
//        定位到元素bit位置
        int indexOf = getIndex(diff);
//        定位到元素
        int num1 = 0, num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (IsBit(nums[i], indexOf)) num1 = num1 ^ nums[i];
            else num2 = num2 ^ nums[i];
        }
        return new int[]{num1, num2};
    }
}
