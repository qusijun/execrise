package com.company;

/**
 * Created by qusijun on 16/3/19.
 */
public class FactorialTrailingZeroes {
    //超时
    public int trailingZeroes(int n)
    {
        int count = 0;
        for (int i = 5;i<=n;i++)
        {
            int j = i;
            while (j%5 == 0)
            {
                count++;
                j /= 5;
            }
        }
        return count;
    }

    public int trailingZeros(int n)
    {
        int count = 0;
        while (n > 0 )
        {
            count += n/5;
            n /= 5;
        }
        return count;

    }

}
