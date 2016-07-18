package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/5/18.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] nums)
    {
        List<Integer> result = new ArrayList<Integer>();
        if (nums.length == 0)
            return result;
        int n = nums.length;
        int m = nums[0].length;
        int i = 0;
        int level = Math.min(n,m)/2;
        for (i = 0;i<level;i++)
        {
            for (int j = i;j<m-1-i;j++)
                result.add(nums[i][j]);
            for (int j = i;j<n-1-i;j++)
                result.add(nums[j][m-1-i]);
            for (int j = m-1-i;j>i;j--)
                result.add(nums[n-1-i][j]);
            for (int j = n-1-i;j>i;j--)
                result.add(nums[j][i]);
        }
        if (Math.min(n,m)%2 == 1)
        {
           if (n < m)
           {
               for (int j = i;j<m-i-1;j++)
                   result.add(nums[i][j]);
           }
           else
           {
                for (int j = i;j<n-1-i;j++)
                    result.add(nums[j][i]);
           }
        }
        return result;
    }
}
