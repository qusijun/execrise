package com.company;

/**
 * Created by qusijun on 16/3/28.
 */
public class VaildPalindrome {
    public boolean isPalindrome(String s)
    {
        String t = s.toLowerCase();
        //System.out.println(t);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<t.length();i++)
        {
            if ((t.charAt(i) >= 'a' && t.charAt(i) <= 'z') || (t.charAt(i) >= '1' && t.charAt(i) <= '9'))
                sb.append(t.charAt(i));
        }
        ///System.out.println(sb.toString());
        if (sb.toString().equals(sb.reverse().toString()))
        {
            return true;
        }
        return false;


    }

    public static void main(String[] args)
    {
        System.out.println(new VaildPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
