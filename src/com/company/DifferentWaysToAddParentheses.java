package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/4/11.
 */
public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String input)
    {
        List<Integer> result = new ArrayList<Integer>();
        boolean flag = false;
        for (int i = 0;i<input.length();i++)
        {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*')
            {
                flag = true;
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));

                for (int result1:left)
                    for (int result2:right)
                    {
                        if (input.charAt(i) == '+')
                            result.add(result1+result2);
                        if (input.charAt(i) == '-')
                            result.add(result1-result2);
                        if (input.charAt(i) == '*')
                            result.add(result1*result2);
                    }
            }

        }
        //假如input中没有运算符号,那么input本身转成int值存进result
        if (!flag)
            result.add(Integer.parseInt(input));
        return result;
    }

}
