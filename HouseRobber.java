package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qusijun on 16/3/18.
 */
public class HouseRobber {
    public int rob(int[] nums)
    {
        int[] result = new int[nums.length +2];
        result[0] = 0;
        result[1] = 0;
        for (int i = 2;i<result.length;i++)
        {
            result[i] = Math.max(result[i-2] + nums[i-2],result[i-1]);
        }
        return result[nums.length+1];
    }

    public static void main(String[] args)
    {
        int[] nums = {1,1,3,4};
        System.out.println(new HouseRobber().rob(nums));
        Queue l = new LinkedList();
        l.add(null);
        System.out.println(l.size());
        while (!l.isEmpty())
        {
            System.out.println(l.poll());
        }
    }
}
