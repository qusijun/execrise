package com.company;

/**
 * Created by qusijun on 16/3/19.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x)
    {
        int digitsLen = (int)Math.log10(x);
        int divisor = (int)Math.pow(10,digitsLen);

        while (x > 0)
        {
            if (x/divisor != x%10)
                return false;
            x %= divisor;
            x /= 10;
            divisor /= 100;
        }
        return true;

    }
}
