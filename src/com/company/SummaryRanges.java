package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by qusijun on 16/3/27.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums)
    {
        List<String> result = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        if (nums.length == 0)
        {
            return result;
        }
        if (nums.length == 1)
        {

            result.add(Integer.toString(nums[0]));
            return result;
        }
        int i,j;
        for (i = 1,j = 0;i<nums.length;i++)
        {
            if ((long)nums[i] - nums[i-1] > 1 )
            {
                if (j < i-1)
                    result.add(nums[j] + "->" + nums[i-1]);
                if (j == i-1)
                    result.add(Integer.toString(nums[j]));
                j = i;
            }
        }

        if (j < i-1)
        {
            result.add(nums[j] + "->" + nums[i-1]);
        }
        if (j == i-1)
        {
            result.add(Integer.toString(nums[j]));
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] nums = {-2147483648,-2147483647,2147483647};
        List<String> r = new SummaryRanges().summaryRanges(nums);
        Iterator i = r.iterator();
        System.out.println((long)(2147483647 -(-2147483647)));
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
