package com.company;

/**
 * Created by qusijun on 16/3/30.
 */
public class SingleNumber3 {
    public int[] singleNumber(int[] nums)
    {
        int result  = 0;
        int result1 = 0;
        int result2 = 0;
        //先求出两个single number的异或结果
        for (int i = 0;i<nums.length;i++)
        {
            result ^= nums[i];
        }
        //根据result的二进制中某一位不为0将数组分为两部分
        int pos ;
        for (pos = 0;pos<32;pos++)
        {
            int temp = result & (1 << pos);
            if (temp != 0)
                break;

        }
        System.out.println(result);
        for (int i = 0;i<nums.length;i++)
        {
            if ((nums[i] & (1<<pos)) != 0)
                result1 ^= nums[i];
            else
                result2 ^= nums[i];
        }

        return new int[]{result1,result2};

    }

    public static void main(String[] args)
    {
        int[] nums = {43772400,1674008457,1779561093,744132272,1674008457,448610617,1779561093,124075538,-1034600064,49040018,612881857,390719949,-359290212,-812493625,124732,-1361696369,49040018,-145417756,-812493625,2078552599,1568689850,865876872,865876872,-1471385435,1816352571,1793963758,2078552599,-1034600064,1475115274,-119634980,124732,661111294,-1813882010,1568689850,448610617,1347212898,-1293494866,612881857,661111294,-1361696369,1816352571,-1813882010,-359290212,1475115274,1793963758,1347212898,43772400,-1471385435,124075538,-1293494866,-119634980,390719949};
        int[] nums2 = {1,2,1,2,-4,5};
        int[] result = new SingleNumber3().singleNumber(nums);
        for(int i = 0;i<result.length;i++)
            System.out.println(result[i]);
    }

}
