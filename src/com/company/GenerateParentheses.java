package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/4/5.
 */
public class GenerateParentheses {
    public List<String> generateParentheses(int n)
    {
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<String>();
        dfs(n,n,sb,result);
        return result;
    }
    public void dfs(int left,int right,StringBuilder sb,List<String> result)
    {
        int len = sb.length();
        if (left ==0 && right == 0)
        {
            result.add(sb.toString());
            return;
        }

        if (left > 0 )
        {
            sb.append("(");
            dfs(left - 1, right, sb, result);
            sb.setLength(len);
        }

        if (right > 0 && left < right)
        {
            sb.append(")");
            dfs(left,right-1,sb,result);
            sb.setLength(len);
        }


    }

    public static void main(String[] args)
    {
        List<String> result = new GenerateParentheses().generateParentheses(3);
        for (int i = 0;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }
    }

}
