package com.company;

/**
 * Created by qusijun on 16/3/28.
 */
public class ZigZagConversion {
    public String convert(String s,int numRows)
    {
        if (numRows == 1)
            return s;
        int mod = 2*numRows-2;
        int numCols = 2*(s.length()/mod+1);
        //System.out.println(numRows+","+numCols);
        char[][] table = new char[numRows][numCols];
        for (int i=0;i<numRows;i++)
            for(int j = 0;j<numCols;j++)
                table[i][j] = '*';
        for (int i = 0;i<s.length();i++)
        {
            if (i%mod < numRows)
                table[i%mod][i/mod * 2] = s.charAt(i);
            else
                table[mod - i%mod][i/mod * 2 + 1] = s.charAt(i);
            //table[mod - i%mod][i/mod+1] = s.charAt();
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0;i<numRows;i++)
        {
            StringBuilder sb = new StringBuilder();
            for (int j = 0;j<numCols;j++)
            {
                if (table[i][j] != '*')
                    sb.append(table[i][j]);
            }
            result.append(sb.toString());

        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        String s = "PAYPALISHIRING";
        String r = new ZigZagConversion().convert(s,3);
        System.out.print(r);
    }
}
