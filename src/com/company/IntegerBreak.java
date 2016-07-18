package com.company;

/**
 * Created by qusijun on 16/4/25.
 */
public class IntegerBreak {
    public int integerBreak(int n)
    {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        result[3] = 2;
        result[4] = 4;
        for(int i = 5;i<=n;i++)
        {
            result[i] = 3*Math.max(i-3,result[i-3]);
        }
        return result[n];

    }



}
