package com.company;

/**
 * Created by qusijun on 16/3/30.
 */
public class SingleNumber {
    public int singleNumber(int[] nums)
    {
        int result = 0;
        for (int i = 0;i<nums.length;i++)
        {
            result ^= nums[i];
        }
        return result;
    }
}
