package com.company;

import java.util.*;

/**
 * Created by qusijun on 16/7/11.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums,int target)
    {
        //List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int i = 0;i<nums.length;i++)
        {
            for (int j = i+1;j<nums.length;j++)
            {
                int p1 = j+1;
                int p2 = nums.length - 1;
                while (p1 < p2)
                {
                    if (nums[i]+nums[j]+nums[p1]+nums[p2] == target)
                    {
                        cur.add(nums[i]);
                        cur.add(nums[j]);
                        cur.add(nums[p1]);
                        cur.add(nums[p2]);
                        result.add(new ArrayList(cur));
                    }
                    else if (nums[i]+nums[j]+nums[p1]+nums[p2] < target)
                        p1++;
                    else
                        p2--;
                }
            }
        }
        return new ArrayList(result);


    }

    public static void main(String[] args)
    {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        ArrayList<List<Integer>> result = (ArrayList)new FourSum().fourSum(nums,target);
        Iterator it = result.iterator();
        while (it.hasNext())
        {

        }
    }

}
