package leetcode.lesson_0_SwordOffer;

public class SingleNumberIII_260 {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for(int num : nums) diff ^= num;

        int indexOf = getIndex(diff);

        int num1 = 0, num2 = 0;

        for (int j = 0; j < nums.length; ++j)
            if (Isbit(nums[j], indexOf)) num1 ^= nums[j];
            else num2 ^= nums[j];

        return new int[]{num1, num2};
    }

    public int getIndex(int miniArr){
        int indexBit = 0;
        while ((miniArr & 1) == 0){
            miniArr = miniArr >> 1;
            indexBit ++;
        }
        return indexBit;
    }

    public boolean Isbit(int num, int Index){
        num = num >> Index;
        return (num & 1) == 1 ? true : false;
    }
}
