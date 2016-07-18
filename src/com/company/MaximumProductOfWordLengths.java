package com.company;

/**
 * Created by qusijun on 16/3/31.
 */
public class MaximumProductOfWordLengths {
    //对于如何判断两个字符串是否包含相同的字母
    //可以利用位图
    //a-z26个字母对应一个数字的二进制表示中的的1-26位
    //如果字符串中包含某个字母,则将对应的那一位置为1
    public int maxProduct(String[] words)
    {
        int max = 0;
        int[] bits = new int[words.length];
        for (int i = 0;i<words.length;i++)
        {
            String word = words[i];
            for (int j = 0;j<word.length();j++)
            {
                bits[i] |= (1<<(word.charAt(j)-'a'));
            }
        }
        for (int i = 0;i<words.length;i++)
        {
            for (int j = i+1;j<words.length;j++)
            {
                if (!haveSameLetter(bits[i],bits[j]) && max < words[i].length()*words[j].length())
                {
                    max = words[i].length() * words[j].length();
                }
            }
        }
        return max;
    }

    public boolean haveSameLetter(int a,int b)
    {
        int and = a & b;
        //如果与运算的结果为0则表示a和b中没有相同的字母
        if (and == 0)
            return false;
        else
            return true;
    }
}
