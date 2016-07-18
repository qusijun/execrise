package com.company;

/**
 * Created by qusijun on 16/5/20.
 */
public class NumMatrix {
    public int[][] sum;
    public NumMatrix(int[][] matrix)
    {
        int rows = matrix.length;
        if (rows == 0)
        {
            sum = new int[1][1];
            sum[0][0] = 0;
            return;
        }
        int cols = matrix[0].length;
        sum = new int[rows][cols];
        sum[0][0] = matrix[0][0];
        for (int i = 1;i<rows;i++)
        {
            sum[i][0] = sum[i-1][0]+matrix[i][0];
        }
        for (int i = 1;i<cols;i++)
        {
            sum[0][i] = sum[0][i-1]+matrix[0][i];
        }
        for (int i = 1;i<rows;i++)
            for(int j = 1;j<cols;j++)
            {
                sum[i][j] = sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+matrix[i][j];
            }
    }
    public int sumRegion(int row1,int col1,int row2,int col2)
    {
        int A = row1 == 0?0:sum[row1-1][col2];
        int B = col1 == 0?0:sum[row2][col1-1];
        int C = (row1 == 0 || col1 == 0)?0:sum[row1-1][col1-1];
        return sum[row2][col2]-A-B+C;
    }

    public static void main(String[] args)
    {
        int[][] matrix = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        NumMatrix nm = new NumMatrix(matrix);
        for (int i = 0;i<nm.sum.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
                System.out.print(nm.sum[i][j]+",");
            System.out.println();
        }


    }
}
