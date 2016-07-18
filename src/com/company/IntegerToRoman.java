package com.company;

/**
 * Created by qusijun on 16/4/1.
 */
public class IntegerToRoman
{
    public String intToRoman(int num)
    {
        //把所有小数字在前的数字也作为基本数字
        int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romans[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0)
        {
            while (num >= vals[i])
            {
                sb.append(romans[i]);
                num -= vals[i];
            }
            i++;
        }
        return sb.toString();
    }

}
