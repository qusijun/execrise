package com.company;

import static java.lang.Math.log;

/**
 * Created by qusijun on 16/3/17.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n)
    {
        //int len = n%26;
        StringBuilder sb = new StringBuilder();
        //int rest;
        while(n > 0)
        {
            int temp = n % 26;
            if (temp == 0) {
                sb.append('Z');
                n = n / 26 - 1;
            }
            else
            {
                sb.append((char)(temp - 1 + 'A'));
                n /= 26;
            }

        }

        return sb.reverse().toString();

    }

    public int titleToNum(String s)
    {
        int carry = 0;
        int sum = 0;
        for (int i = s.length()-1;i>=0;i--)
        {
            int temp = s.charAt(i) - 'A' + 1 + carry;
            int pow = s.length() - 1 - i;
            carry = temp / 26;
            temp %= 26;
            sum += (temp * Math.pow(26, pow));

        }
        sum += carry * Math.pow(26,s.length());
        return sum;
    }

    public static void main(String[] args)
    {
        char a = 'A';
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(1200));
        System.out.println(new ExcelSheetColumnTitle().titleToNum("Z"));
    }
}
