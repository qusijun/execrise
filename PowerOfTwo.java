package com.company;

/**
 * Created by qusijun on 16/3/18.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n)
    {
        if (n <= 0)
            return false;
        int max = 1 << 31;
        if (max % n == 0)
            return true;
        return false;
    }
}
