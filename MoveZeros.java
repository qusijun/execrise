package com.company;

/**
 * Created by qusijun on 16/3/16.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums)
    {
        int j = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if (nums[i] != 0)
            {
                swap(nums,i,j++);

            }
        }
        for(int k = 0;k<nums.length;k++)
            System.out.println(nums[k]);
    }

    public void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public static void main(String[] args)
    {
        new MoveZeros().moveZeroes(new int[]{0,1,0,3,12});
    }
}
