package com.company;

import java.util.HashMap;

/**
 * Created by qusijun on 16/3/14.
 */
public class LongestSubstringWithoutRepeated {
    public int lengthOfLongestSubstring(String s)
    {
        //int[] last = new int[128];
        //for (int i = 0;i < last.length;i++)
        //    last[i] = -1;
        HashMap map = new HashMap();
        int start = 0;
        int max = 0;

        for (int i = 0;i < s.length();i++)
        {
            char cur = s.charAt(i);
            //System.out.println(cur);
            //cur在前面出现过

            if (map.containsKey(cur))
            {
                if(max < i  -start)
                    max = i - start;

                start = (int)map.get(cur) + 1;
            }
            map.put(cur,i);
        }
        return max >= s.length() - start?max:s.length() -start;
    }
    public static void main(String[] args)
    {
        LongestSubstringWithoutRepeated lswr = new LongestSubstringWithoutRepeated();
        System.out.println(lswr.lengthOfLongestSubstring("abba"));
    }
}
