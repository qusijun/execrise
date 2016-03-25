package com.company;

/**
 * Created by qusijun on 16/3/25.
 */
public class ReverseIneger {
    public int reverse(int x)
    {
        long remnant = 0;
        //int result = 0;
        int back = x;
        if (x < 0)
        {
            x = Math.abs(x);
        }
        while (x > 0)
        {
            int digit = x % 10;
            x /= 10;
            remnant = remnant * 10 + digit;

        }
        if (remnant > Integer.MAX_VALUE)
        {
            remnant = 0;
        }
        if (back < 0)
        {
            remnant = -remnant;
        }
        return (int)remnant;
    }

    public static void main(String[] args)
    {
        System.out.print(new ReverseIneger().reverse(1238488589));
    }

}
