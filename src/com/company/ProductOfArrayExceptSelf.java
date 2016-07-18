package com.company;

/**
 * Created by qusijun on 16/3/30.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums)
    {
        //两点需要考虑
        //一是数组中所有元素的乘积可能会溢出
        //二是数组中出现0元素
        //假如数组中有两个及以上的0元素,那么返回的数组中所有元素为0
        //如果只有一个0,则需要记录除了这个零之外的乘积.
        long total = 1;
        long totalWithoutZero = 1;
        int zeroCount = 0;
        int[] result = new int[nums.length];
        for (int i = 0;i<nums.length;i++)
        {

            if (nums[i] == 0)
            {
                zeroCount++;
                continue;
            }
            total *= nums[i];
        }
        if (zeroCount >= 2)
            return result;
        else if (zeroCount == 1)
        {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    result[i] = (int) total;
                    break;
                }

            }
        }
        else
        {
            for (int i = 0; i < nums.length; i++)
            {
                result[i] = (int) (total / nums[i]);
            }

        }
        return result;
    }
}
