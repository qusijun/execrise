package com.company;

/**
 * Created by qusijun on 16/3/19.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums)
    {
        int j = 0;
        for (int i = 0;i < nums.length-1; i++)
        {
            if (nums[i] != nums[i+1])
            {
                nums[++j] = nums[i+1];
            }

        }
        return j+1;
    }
}
