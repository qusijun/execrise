package com.company;

import java.util.Arrays;

/**
 * Created by qusijun on 16/7/10.
 */
public class ThreeSumCloest {
    public int threeSumClosest(int[] nums,int target)
    {
        Arrays.sort(nums);
        int result = 0;
        int minDis = Integer.MAX_VALUE;
        for (int i = 0;i<nums.length;i++)
        {
            int p1 = i+1;
            int p2 = nums.length - 1;
            ///int curSum = nums[i];
            //int curDis = 0;
            while (p1 < p2)
            {
                int curSum = nums[i] + nums[p1] + nums[p2];
                int curDis = Math.abs(curSum - target);
                if (curDis < minDis)
                {
                    minDis = curDis;
                    result = curSum;
                }
                if (curSum > target)
                    p2--;
                else if (curSum < target)
                    p1++;
                else
                    return curSum;

            }
        }
        //return result;
        return result;
    }
}
