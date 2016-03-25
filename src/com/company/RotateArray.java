package com.company;

import java.util.ArrayList;

/**
 * Created by qusijun on 16/3/28.
 */
public class RotateArray {
    public void rotate(int[] nums,int k)
    {
        if (nums.length == 0)
            return;
        k %= nums.length;
        for (int i = 0;i<(nums.length-k)/2;i++)
            swap(nums,i,nums.length-k-i-1);
        for (int i = nums.length - k;i<nums.length-k/2;i++)
            swap(nums,i,2*nums.length-k-1-i);
        for (int i = 0;i<nums.length/2;i++)
            swap(nums,i,nums.length-i-1);

    }

    public void swap(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,2};
        new RotateArray().rotate(nums,0);
        for (int i = 0;i<nums.length;i++)
            System.out.println(nums[i]);


        //int a = 010;
        int b = 001;
        String a = "010";
        int c = Integer.parseInt(a);

        System.out.print(c);
    }
}
