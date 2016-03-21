package com.company;

import java.util.Arrays;

/**
 * Created by qusijun on 16/3/17.
 */
public class ValidAnagram {
    public boolean isAnagram(String s,String t)
    {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        if (s.length() != t.length())
            return false;
        for (int i = 0;i<s.length();i++)
        {
            if (sArr[i] != tArr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {

    }
}
