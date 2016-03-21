package com.company;

/**
 * Created by qusijun on 16/3/19.
 */
public class PlusOne
{
    public int[] plusOne(int[] digits)
    {
        digits[digits.length-1] += 1;
        int carry = digits[digits.length - 1] / 10;
        digits[digits.length - 1] %= 10;

        for (int i = digits.length - 2;i>=0;i--)
        {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        if (carry > 0 )
        {
            int[] result = new int[digits.length+1];
            result[0] = carry;
            for (int i = 0;i<digits.length;i++)
            {
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;

    }
}
