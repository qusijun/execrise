package com.company;

import java.util.Arrays;

/**
 * Created by qusijun on 16/4/6.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums)
    {
        if (nums.length == 0)
            return 0;
        //result[i]表示包含nums[i]所得到的最大值.
        //int[] result = new int[nums.length];
        //result[0] = nums[0];
        int cur = nums[0];
        int max = nums[0];
        for (int i = 1;i<nums.length;i++)
        {
            //result[i] = Math.max(result[i-1]+nums[i],nums[i]);
            cur = Math.max(cur+nums[i],nums[i]);
            if (cur > max)
                max = cur;

        }
        return max;
    }


    public int solution(int[] nums)
    {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1;i<nums.length;i++)
            result[i]= Math.max(result[i-1]+nums[i],nums[i]);
        for (int i = 0;i<nums.length;i++)
            System.out.println(result[i]);
        Arrays.sort(result);

        return result[nums.length-1];

    }

    public static void main(String[] args)
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int a = 3/2;
        System.out.println(a);

    }




}
