package com.company;

import java.util.HashMap;

/**
 * Created by qusijun on 16/3/17.
 */
public class ContainDuplicate {
    public static void main(String[] args)
    {

    }
    public boolean containsDuplicate(int[] nums)
    {
        HashMap map = new HashMap();
        for (int i = 0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return false;
    }

}
