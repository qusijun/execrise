package com.company;

/**
 * Created by qusijun on 16/3/18.
 */
public class UglyNumber {
    //这种方法会超时
    public boolean isUgly1(long num)
    {
        int factor = 2;
        while (factor * factor <= num)
        {
            while (num % factor == 0)
            {
                num /= factor;
                System.out.println(factor);
                if (factor != 2 && factor != 3 && factor != 5)
                {
                    return false;
                }
            }
            //System.out.println(factor);

            factor++;
        }
        if (num != 2 && num != 3 && num != 5)
        {
            return false;
        }

        return true;
    }

    //不会超时的算法
    public boolean isUgly(int num)
    {
        if (num < 1)
            return false;
        int[] factors = {2,3,5};
        for (int factor : factors)
        {
            while (num % factor == 0)
                num /= factor;

        }
        if (num == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        boolean r = new UglyNumber().isUgly1(2147483648L);
        System.out.println(r);
    }

}
