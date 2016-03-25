package com.company;

import java.util.Iterator;

/**
 * Created by qusijun on 16/3/29.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0 )
            return 0;
        StringBuilder sb = new StringBuilder();
        long result = 0;
        int start = 0;
        if (str.charAt(0) == '+' || str.charAt(0) == '-')
            start = 1;
        //System.out.println(start);
        for (int i = start; i < str.length(); i++)
        {
            //System.out.println(str.charAt(i));
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                sb.append(str.charAt(i));
            else
                break;
        }
        System.out.println(sb.toString());
        String newstr = sb.toString();
        long k = 1;
        for (int i = newstr.length()-1; i >= 0; i--)
        {
            if (result > Integer.MAX_VALUE)
                break;
            result +=((newstr.charAt(i)-'0')*k);
            k *= 10;

        }
        //result = Integer.parseInt(newStr)
        //System.out.println(result);
        if (str.charAt(0) == '-')
            result = -result;
        if (result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;
        return (int)result;

    }

    public static void main(String[] args)
    {
        int result = new StringToInteger().myAtoi("9223372036854775809");
        System.out.println(Long.MAX_VALUE);
        System.out.print(result);
    }

}
