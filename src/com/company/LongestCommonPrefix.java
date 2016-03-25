package com.company;

import java.util.Arrays;

/**
 * Created by qusijun on 16/3/26.
 */
public class LongestCommonPrefix {
    //笨方法,会超时!!!!
    public String longestCommonPrefix1(String[] strs)
    {
        if (strs.length == 0)
            return "";
        String[] result = new String[strs.length];
        result[0] = strs[0];
        for(int i = 1;i<strs.length;i++)
        {
            result[i] = getPrefix(result[i-1],strs[i]);
        }

        return result[strs.length-1];
    }

    public String getPrefix(String s1,String s2)
    {
        int end = 0;
        int len = Math.min(s1.length(),s2.length());
        for (int i = 0;i<len;i++)
        {
//            System.out.println(s1.charAt(i) == s2.charAt(i));
            if (s1.charAt(i) == s2.charAt(i))
            {
                end++;
               // System.out.println(i);

            }
            else
            {
                break;
            }
            System.out.println(end);
        }

        return s1.substring(0,end);
    }

    //brilliant 方法,简介并且不会超时!
    //对字符串数组进行排序,比较最长的和最短的两个字符串的最长prefix
    public String longestCommonPrefix(String[] strs)
    {
        if (strs.length == 0)
            return "";
        Arrays.sort(strs);
        return getPrefix(strs[0],strs[strs.length-1]);
    }

    public static void main(String[] args)
    {
        String[] strs = {"acaa","cba"};
        Arrays.sort(strs);
       // String r = new LongestCommonPrefix().longestCommonPrefix(strs);
        System.out.print(strs[0]);
    }

}
