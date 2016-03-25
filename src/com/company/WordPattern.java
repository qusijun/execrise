package com.company;

import java.util.HashMap;

/**
 * Created by qusijun on 16/3/25.
 */
public class WordPattern {
    public boolean wordPattern(String pattern,String str)
    {
        //会出现这种情况
        //pattern = "abba"
        //str = "dog dog dog dog"
        //和Isomorphic Strings题目类似,都需要考虑不同的key对应相同的value
        String[] strArray = str.trim().split(" ");
        boolean flag = true;
        HashMap map = new HashMap();
        if (pattern.length() != strArray.length)
        {
            return false;
        }
        for(int i = 0;i<pattern.length();i++)
        {
            if (map.containsKey(pattern.charAt(i)))
            {
                if (!strArray[i].equals((String)map.get(pattern.charAt(i))))
                {
                    flag = false;
                    break;
                }

            }
            else
            {
                if (map.containsValue(strArray[i]))
                {
                    flag = false;
                    break;
                }
                map.put(pattern.charAt(i),strArray[i]);
            }
        }
        return flag;
    }
}
