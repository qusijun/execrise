package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by qusijun on 16/4/22.
 */
public class PermutationSequence {
    public String getPermutation(int n,int k)
    {
        int[] num = new int[n];
        for(int i=0;i<n;i++)
            num[i] = i+1;
        List<String> result = new ArrayList();
        permutate(num,k,0,result);
        return result.get(result.size()-1);

    }
    int a= 1;
    public void permutate(int[] num,int k,int left,List<String> result)
    {
        //System.out.println(index);
        if (left == num.length)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num.length; i++)
                sb.append(num[i]);
            if (result.size() == k)
            {
                return;
            }
            result.add(sb.toString());
        }
        else
        {
            for (int i = left;i<num.length;i++)
            {
                swap(num,left,i);
                permutate(num,k,left+1,result);
                swap(num,left,i);
            }
        }
    }

    public void swap(int[] num,int a,int b)
    {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

    public static void main(String[] args)
    {
        PermutationSequence ps = new PermutationSequence();
        int n = 9;
        int k = 2678;
        String result = ps.getPermutation(n,k);
        //System.out.println(a);
    }
}
