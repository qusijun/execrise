package com.company;

/**
 * Created by qusijun on 16/3/18.
 */
public class ClimbingStairs {
    public int climbStairs(int n)
    {
        int[] result = new int[n+2];
        result[1] = 1;
        result[2] = 2;
        for(int i = 3;i<n+1;i++)
        {
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];
    }

    public static void main(String[] args)
    {
        int result = new ClimbingStairs().climbStairs(1);
        System.out.println(result);

    }
}
