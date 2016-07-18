package com.company;

import java.util.*;

/**
 * Created by qusijun on 16/4/18.
 */
public class Combinations {
    public List<List<Integer>> combine(int n,int k)
    {
        List<List<Integer>> result = new ArrayList();
        List<Integer> cur = new ArrayList();
        combine(n,k,0,0,cur,result);
        return result;

    }

    public void combine(int n,int k,int depth,int curNum,List<Integer> cur,List<List<Integer>> result)
    {
        if (depth == k)
            result.add(new ArrayList(cur));
        else if (depth < k)
        {
            for (int i = curNum+1;i<=n;i++)
            {
                cur.add(i);
                combine(n, k, depth + 1, i, cur, result);
                cur.remove(cur.size()-1);
            }
        }
    }
}
