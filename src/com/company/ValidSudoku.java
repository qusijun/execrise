package com.company;

/**
 * Created by qusijun on 16/3/29.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board)
    {
        //这道题并不是求数独的解,而是判断数独中当前的数值是否满足数独的规则!
        //空间换时间,对每一行,每一列,每一个子方块中已经出现的数字进行保存,如果有重复,return false
        boolean[][] rowValid = new boolean[9][9];
        boolean[][] colValid = new boolean[9][9];
        boolean[][] boxValid = new boolean[9][9];

        for (int i = 0;i<9;i++)
        {
            for(int j = 0;j<9;j++)
            {
                if (board[i][j] == '.')
                    continue;
                int num = board[i][j] - '1';
                if (rowValid[i][num] || colValid[j][num] || boxValid[(i/3)*3+j/3][num])
                    return false;
                rowValid[i][num] = colValid[j][num] = boxValid[(i/3)*3+j/3][num] = true;
            }
        }
        return true;
    }
}
