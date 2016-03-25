package com.company;

/**
 * Created by qusijun on 16/3/27.
 */
public class NumArray {
    private int[] nums;
    private int[] sums;
    public NumArray(int[] nums)
    {
        this.nums = nums;
        sums = new int[nums.length];
    }

    public int sumRange(int i,int j)
    {
        sums[0] = nums[0];
       for (int k = 1;k<sums.length;k++)
           sums[k] = sums[k-1] + nums[k];
        if (i == 0)
            return sums[j];
        else
            return sums[j] - sums[i-1];
    }

    public static void main(String[] args)
    {

    }

}
