package com.company;

/**
 * Created by qusijun on 16/3/27.
 */
public class ImplementStrstr {
    public int strStr(String hayStack,String needle)
    {
        if (needle.length() == 0)
            return 0;
        int[] next = new int[needle.length()];
        int i = 0;
        int j = 0;
        getNext(needle,next);
        while (i < hayStack.length() && j < needle.length())
        {
            if (j == -1 || hayStack.charAt(i) == needle.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j = next[j];
            }
        }
        if (j == needle.length()-1)
            return i - j;
        return -1;
    }

    public void getNext(String needle,int[] next)
    {
        int k = -1;
        int j = 0;
        next[0] = -1;
        while (j < needle.length()-1)
        {
            if(k == -1 || needle.charAt(j) == needle.charAt(k))
                next[++j] = ++k;
            else
                k = next[k];
        }
    }
}
