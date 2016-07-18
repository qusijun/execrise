package com.company;

/**
 * Created by qusijun on 16/7/7.
 */
public class SumOfTwoIntegers {
    public int getSum(int a,int b)
    {
        if (a == 0) return b;
        if (b == 0) return a;
        //int carry = 0;
        while (b != 0)
        {
          int carry = a & b;
            a ^= b;
            b = carry << 1;
        }
        return a;
    }
}
