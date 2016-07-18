package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by qusijun on 16/3/19.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int n)
    {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (n <= 0)
            return result;
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        result.add(firstRow);
        for (int i = 1;i<n;i++)
        {
            List<Integer> lastRow = result.get(i-1);
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            //row.add(i,1);
            for (int j = 1;j<i;j++)
                row.add(j,lastRow.get(j)+lastRow.get(j-1));
            row.add(1);
            result.add(row);
        }
        return result;


    }

    public static void main(String[] args)
    {
        List<List<Integer>> r = new PascalTriangle().generate(1);
        ListIterator itr = r.listIterator();
        while (itr.hasNext())
        {
            ArrayList<Integer> row = (ArrayList<Integer>)itr.next();
            ListIterator rowItr = row.listIterator();
            while (rowItr.hasNext())
                System.out.print(rowItr.next()+",");
            System.out.println();

        }
    }
}
