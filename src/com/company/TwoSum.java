package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by qusijun on 16/3/16.
 */
public class TwoSum {
    public int[] twoSum(int[] nums,int target)
    {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        for (int in = 0;in<arr.length;in++)
        {
            System.out.println(nums[in]);
        }
        int i = 0;
        int j = arr.length - 1;
        int left,right;
        left = right = -1;
        int[] result = new int[2];
        while(i < j)
        {
            if (arr[i] + arr[j] == target)
            {
                left = arr[i];
                right = arr[j];
                break;
            }
            else if(arr[i] + arr[j] < target)
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        for(int k = 0;k<nums.length;k++)
        {
            if (nums[k] == left)
            {
                result[0] = k;
                break;
            }
        }

        for(int k = nums.length-1;k>=0;k--)
        {
            if (nums[k] == right)
            {
                result[1] = k;
                break;
            }
        }
        return result;


    }

    public static void main(String[] args)
    {
        int[] result = new TwoSum().twoSum(new int[]{3,2,4},6);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
