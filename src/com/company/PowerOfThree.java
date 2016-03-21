package com.company;

/**
 * Created by qusijun on 16/3/18.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n)
    {
        if (n <= 0)
            return false;
        int max = 1162261467;
        if (max % n == 0)
            return true;
        return false;
    }
}
