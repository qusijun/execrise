package com.company;

/**
 * Created by qusijun on 16/4/11.
 */
public class SpiralMatrix2 {
    public int[][] generateMatrix(int n)
    {
        int idx = 1;
        int[][] result = new int[n][n];
        for (int i = 0;i<Math.ceil(n*1.0/2);i++)
        {
            for (int j = i;j<n-i-1;j++)
                result[i][j] = idx++;
            for (int j = i;j<n-i-1;j++)
                result[j][n-1-i] = idx++;
            for (int j = n-i-1;j>i;j--)
                result[n-i-1][j] = idx++;
            for (int j = n-i-1;j>i;j--)
                result[j][i] = idx++;
        }
        if (n%2 == 1)
            result[n/2][n/2] = idx;
        return result;
    }
}
