package com.company;

/**
 * Created by qusijun on 16/4/5.
 */
public class EditDistance {
    public int minDistance(String word1,String word2)
    {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] result = new int[len1+1][len2+1];
        for (int i = 0;i<=len1;i++)
            result[i][0] = i;
        for (int i = 0;i<=len2;i++)
            result[0][i] = i;
        for (int i = 1;i<=len1;i++)
            for (int j = 1;j<=len2;j++)
            {
                if (word1.charAt(i) == word2.charAt(j))
                    result[i][j] = result[i-1][j-1];
                else
                {
                    result[i][j] = Math.min(result[i-1][j-1],Math.min(result[i-1][j],result[i][j-1]))+1;
                }
            }
        return result[len1][len2];
    }
}
