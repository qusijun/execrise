package com.company;

/**
 * Created by qusijun on 16/4/11.
 */
public class RotateImage {
    //not in place
    public void rotateNotInPlace(int[][] matrix)
    {
        if (matrix.length == 0)
            return;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] temp = new int[rows][cols];
        for (int i = 0;i<rows;i++)
            for(int j = 0;j<cols;j++)
                temp[i][j] = temp[rows-1-j][i];

        for(int i = 0;i<rows;i++)
            for(int j = 0;j<cols;j++)
                matrix[i][j] = temp[i][j];
    }
    //in place
    public void rotateInPlace(int[][] matrix)
    {
        if (matrix.length == 0)
            return;
        int rows = matrix.length;
        for(int i = 0;i<rows/2;i++)
        {
            for(int j = 0;j<Math.ceil(rows*1.0/2);j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows-1-j][i];
                matrix[rows-1-j][i] = matrix[rows-1-i][rows-1-j];
                matrix[rows-1-i][rows-1-j] = matrix[j][rows-1-i];
                matrix[j][rows-1-i] = temp;
            }

        }
    }
}
