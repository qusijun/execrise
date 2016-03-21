package com.company;

import java.util.HashMap;

/**
 * Created by qusijun on 16/3/17.
 */
public class RomanToInteger {
    public int romanToInt(String s)
    {
        HashMap map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum =(int)map.get(s.charAt(0));
        for(int i = 0;i<s.length()-1;i++)
        {
            if ((int)map.get(s.charAt(i))>=(int)map.get(s.charAt(i+1)))
            {
                sum += (int)map.get(s.charAt(i+1));
            }
            else
            {
                sum = sum + (int)map.get(s.charAt(i+1)) - 2*(int)map.get(s.charAt(i));
            }
        }
        return sum;

    }
}
