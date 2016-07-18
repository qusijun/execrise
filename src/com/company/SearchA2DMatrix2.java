package com.company;

/**
 * Created by qusijun on 16/4/17.
 */
public class SearchA2DMatrix2 {
    //拿target跟矩阵右上角的元素x比较
    //x>target意味着这一列没有target
    //x<target意味着这一行没有target
    public boolean searchMatrix(int[][] matrix,int target)
    {
        if (matrix.length == 0)
            return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length  && j >= 0)
        {
            int x = matrix[i][j];
            if (x == target)
                return true;
            else if (x < target)
                i++;
            else
                j--;

        }
        return false;
    }

}