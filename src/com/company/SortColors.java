package com.company;

/**
 * Created by qusijun on 16/4/10.
 */
public class SortColors {
    public void sortColors(int[] nums)
    {
        int[] slots = new int[3];
        for (int i = 0;i<nums.length;i++)
            slots[nums[i]]++;
        for (int i = 0;i<slots[0];i++)
            nums[i] = 0;
        for (int i = slots[0];i<slots[0]+slots[1];i++)
            nums[i] = 1;
        for (int i = slots[0]+slots[1];i<slots[0]+slots[1]+slots[2];i++)
            nums[i] = 2;
    }

}
