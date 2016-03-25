package com.company;

import java.util.HashMap;

/**
 * Created by qusijun on 16/3/25.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s,String t)
    {
        HashMap map = new HashMap();
        boolean flag = true;
        for (int i= 0;i<s.length();i++)
        {
            if (map.containsKey(s.charAt(i)))
            {
                if ((char)map.get(s.charAt(i)) != t.charAt(i))
                    flag = false;
            }
            else
            {
                if (map.containsValue(t.charAt(i)))
                    flag = false;
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return flag;
    }
}
