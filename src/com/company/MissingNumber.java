package com.company;

/**
 * Created by qusijun on 16/3/31.
 */
public class MissingNumber {
    public int missingNumber(int[] nums)
    {
        int totalSum = 0;
        int total = 0;
        int n = nums.length;
        for (int i= 1;i<=n;i++)
        {
            totalSum += i;
        }
        for (int i = 0;i<nums.length;i++)
        {
            total += nums[i];
        }
        return totalSum - total;
    }
}
