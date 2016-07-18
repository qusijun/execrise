package com.company;

/**
 * Created by qusijun on 16/4/18.
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix,int target)
    {
        if (matrix.length == 0)
            return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows*cols-1;
        int mid = 0;
        while (low <= high && low >= 0 && high <= rows*cols-1)
        {
            mid = low + (high-low)/2;
            if (matrix[mid/cols][mid%cols] == target)
                return true;
            else if (matrix[mid/cols][mid%cols] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }
        return false;
    }

}
