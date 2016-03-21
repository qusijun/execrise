package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/3/19.
 */
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex)
    {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        for (int i = 1;i <= rowIndex;i++)
        {
            for (int j = result.size()-1;j >= 1;j--)
            {
                result.set(j,result.get(j-1)+result.get(j));
            }
            result.add(1);
        }
        return result;

    }
}
