package com.company;

/**
 * Created by qusijun on 16/4/1.
 */
public class SingleNumber2 {
    public int singleNumber(int[] nums)
    {
        //32个数代表一个数的二进制的32位中出现1的次数
        //这是一种通用的算法,不管是一个数字重复出现3次还是4次
        //任意k次都可以用这个算法解答
        int[] bits = new int[32];
        int result = 0;
        for (int i = 0;i<nums.length;i++)
        {
            for (int j = 0;j<32;j++)
            {
                int temp = nums[i] & (1<<j);
                if(temp != 0)
                    bits[j]++;
            }
        }
        for (int i = 0;i<32;i++)
        {
            if (bits[i]%3 != 0)
                result += (1 << i);
        }
        return result;
    }
}
