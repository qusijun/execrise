package com.company;

/**
 * Created by qusijun on 16/3/23.
 */
public class ReverseBits {
    public int reverseBits(int n)
    {
        if (n == 0) return n;
        long result = 0;
        int temp =1;
        for (int i=0;i<32;i++)
        {
            int digit = n & temp;
            //System.out.println(digit);
            if (digit != 0)
                result = result * 2 + 1;
            else
                result = result * 2;
            temp <<= 1;
        }
        return (int)result;

    }

    public static void main(String[] args)
    {

        System.out.println(new ReverseBits().reverseBits(5));
    }
}
