package com.company;

/**
 * Created by qusijun on 16/4/10.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid)
    {
        if (grid.length == 0)
        {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] result = new int[rows][cols];
        result[0][0] = grid[0][0];
        for(int i = 1;i<rows;i++)
        {
            result[i][0] = result[i-1][0]+grid[i][0];
        }
        for(int i = 1;i<cols;i++)
        {
            result[0][i] = result[0][i-1]+grid[0][i];
        }

        for (int i = 1;i<rows;i++)
            for (int j = 1;j<cols;j++)
                result[i][j] = Math.min(result[i-1][j],result[i][j-1])+grid[i][j];

        return result[rows-1][cols-1];

    }
}
