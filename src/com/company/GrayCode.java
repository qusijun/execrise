package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/4/7.
 */
public class GrayCode {
    public List<Integer> grayCode(int n)
    {
        List<Integer> result = new ArrayList<Integer>();

        result.add(0);
        if (n == 0)
            return result;
        result.add(1);
        if (n == 1)
            return result;

        int carry = 1;
        for (int i = 2;i<=n;i++)
        {
            carry *= 2;
            int maxIndex = result.size();
            for(int j = maxIndex-1;j>=0;j--)
            {
                int temp = result.get(j);
                temp |= carry;
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        List<Integer> result = new GrayCode().grayCode(3);
        for (int i = 0;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }
    }

}
