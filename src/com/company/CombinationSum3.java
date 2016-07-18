package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/4/8.
 */
public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k,int n)
    {
        List<Integer> subList = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combinationSum3(k,n,0,0,0,subList,result);
        return result;
    }

    public void combinationSum3(int k,int n,int depth,int curSum,int parent,List<Integer>subList,List<List<Integer>> result) {
        if (curSum == n && depth == k) {
            result.add(new ArrayList(subList));
            //subList.clear();
            //return;
        } else if (curSum < n && depth < k) {
            for (int i = parent + 1; i < 10; i++) {
                if (curSum + i <= n) {
                    subList.add(i);
                    combinationSum3(k, n, depth + 1, curSum + i, i, subList, result);
                    subList.remove(subList.size() - 1);

                }else{
                    break;
                }
            }


        }
    }


    public static void main(String[] args)
    {
        List<List<Integer>> result = new CombinationSum3().combinationSum3(3,7);
        //System.out.println(result.size());
        for (int i = 0;i<result.size();i++)
        {
            List temp = result.get(i);
            //System.out.println(temp.size());
            for(int j = 0;j<temp.size();j++)
                System.out.print(temp.get(j) + " ");
            System.out.println();
        }
    }


}
