package com.company;

/**
 * Created by qusijun on 16/3/16.
 */
public class AddDigits {
    //不用循环在O(1)时间内获得结果
    public int addDigits(int n)
    {
        return n-9*((n-1)/9);
    }

}
