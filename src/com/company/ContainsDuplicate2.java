package com.company;

import java.util.HashMap;

/**
 * Created by qusijun on 16/3/23.
 */
public class ContainsDuplicate2 {
    public boolean containsNearDuplicate(int[] nums,int k)
    {
        HashMap map = new HashMap();
        for (int i = 0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int j = (int)map.get(nums[i]);
                if(i-j<=k)
                    return true;
            }
            map.put(nums[i],i);
        }

        return false;
    }
}
