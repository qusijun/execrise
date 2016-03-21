package com.company;

/**
 * Created by qusijun on 16/3/16.
 */

/**
 * 当
 */
public class Stack1 {
    public static void main(String[] args)
    {
        System.out.println(new Stack1().canWin(1));
    }

    public boolean canWin(int n)
    {
        return n%4 == 0?false:true;
    }

}
