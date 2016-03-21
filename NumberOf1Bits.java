package com.company;

/**
 * Created by qusijun on 16/3/17.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n)
    {
        int count = 0;
        //n &= 0xFFFFFFFF;
        long x = Integer.toUnsignedLong(n);
        while (n > 0)
        {
            if (n%2 == 1)
                count++;
            n /= 2;
        }
        return count;
    }

    public static void main(String[] args)
    {

    }
}
