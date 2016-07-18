package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qusijun on 16/6/10.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates,int target)
    {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList();
        List<Integer> curResult = new ArrayList<>();
        combinationSum(candidates,0,0,curResult,result,target);
        return result;
    }

    public void combinationSum(int[] candidates,int cur,int index,List<Integer> curResult,List<List<Integer>> result,int target)
    {
        if (cur == target)
        {
            result.add(new ArrayList(curResult));
        }
        else
        {
            for (int i = index;i<candidates.length;i++ )
            {
                if(cur+candidates[i] <= target)
                {
                    curResult.add(candidates[i]);
                    combinationSum(candidates, cur + candidates[i], i, curResult, result, target);
                    curResult.remove(curResult.size()-1);
                }
            }
        }
    }
}
