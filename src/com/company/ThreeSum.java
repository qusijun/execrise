package com.company;

import java.util.*;

/**
 * Created by qusijun on 16/7/7.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        //List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set result = new HashSet();
        List<Integer> cur = new ArrayList<Integer>();
        //int pointer1;
        //int pointer2;
        //int pointer3;
        //pointer1 = 0;
        //pointer2 = nums.length -1 ;
        for (int i = 0;i<nums.length-1;i++)
        {
            if (nums[i] > 0)
                break;

            int pointer1 = i+1;
            int pointer2 = nums.length- 1;
            while (pointer1 < pointer2)
            {
                if (nums[i] + nums[pointer1] + nums[pointer2] == 0)
                {
                    cur.add(nums[pointer1]);
                    cur.add(nums[i]);
                    cur.add(nums[pointer2]);
                    result.add(new ArrayList(cur));
                    pointer1++;
                    pointer2--;
                    cur.clear();
                }
                else if (nums[i] + nums[pointer1] + nums[pointer2] > 0)
                    pointer2--;
                else
                    pointer1++;
            }
        }

        return new ArrayList(result);

    }

    public static void main(String[] args)
    {
        int[] nums = {1,4,2,5,3,-9};
        List<List<Integer>> result;
        result = new ThreeSum().threeSum(nums);
        System.out.println(result.size());
        Iterator it = result.iterator();
        while (it.hasNext())
        {
            ArrayList<Integer> row = (ArrayList)it.next();
            for(int i = 0;i<row.size();i++)
                System.out.print(row.get(i));
            System.out.println();
        }
    }
}
