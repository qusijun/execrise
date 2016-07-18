package com.company;

import java.util.HashMap;

/**
 * Created by qusijun on 16/3/17.
 */
public class MajorityElement {
    public int majorityElement(int[] nums)
    {
        HashMap map = new HashMap();
        for(int i = 0;i<nums.length;i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i],(int)map.get(nums[i])+1);
                if ((int)map.get(nums[i])>nums.length/2)
                {
                    return nums[i];
                }
            }
            else
            {
                map.put(nums[i],1);
                if ((int)map.get(nums[i])>nums.length/2)
                {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
