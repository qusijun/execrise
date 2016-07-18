package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qusijun on 16/4/7.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permute(nums,0,result);
        return result;
    }

    public void permute(int[] nums,int left,List<List<Integer>> result)
    {
        if (left == nums.length )
        {
            List<Integer> subList = new ArrayList<Integer>();
            for (int num:nums)
            {
                subList.add(num);
            }
            result.add(subList);
            return;
        }
        else
        {
            for(int i = left;i<nums.length;i++)
            {
                swap(nums,i,left);
                permute(nums, left + 1, result);
                swap(nums,i,left);
            }
        }
    }


    public void swap(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args)
    {
        List<List<Integer>> result = new Permutations().permute(new int[] {1,2,3});
        for (int i = 0;i<result.size();i++)
        {
            List temp = result.get(i);
            for (int j = 0;j<temp.size();j++)
                System.out.print(temp.get(j)+" ");
            System.out.println();
        }
    }

}
