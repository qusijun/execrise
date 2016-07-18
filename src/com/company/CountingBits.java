package com.company;

/**
 * Created by qusijun on 16/3/29.
 */
public class CountingBits {
    public int[] countBits(int num)
    {
        //时间复杂度O(n)
        if (num == 0)
            return new int[]{0};
        int[] result = new int[num+1];
        result[0] = 0;
        result[1] = 1;
        for(int i = 2;i<result.length;i++)
        {
            int exp = (int)(Math.log(i)/Math.log(2));
            System.out.println("i="+i+",exp="+exp);
            result[i] = result[i-(1<<exp)] + 1;
        }
        return result;

    }

    public static void main(String[] args)
    {
        int[] result = new CountingBits().countBits(10);
        for (int i = 0;i<result.length;i++)
        {
            System.out.println(i+"="+result[i]);
        }
    }

}
