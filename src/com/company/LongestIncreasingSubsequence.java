package com.company;

/**
 * Created by qusijun on 16/4/26.
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums)
    {
        int[] result = new int[nums.length];
        int maxLength = 0;
        for (int i = 0;i<nums.length;i++)
        {
            int max = 0;
            for(int j = 0;j<i;j++)
            {
                if (nums[i] > nums[j])
                    max = Math.max(max,result[j]);
            }
            result[i] = max+1;
        }
        for (int r:result)
        {
            maxLength = Math.max(maxLength,r);
        }
        return maxLength;
    }

}
