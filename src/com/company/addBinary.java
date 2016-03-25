package com.company;

/**
 * Created by qusijun on 16/3/27.
 */
public class addBinary {
    public String addBinary(String a,String b)
    {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0)
        {
            int temp = a.charAt(i) - '0' + b.charAt(j) - '0' + carry;
            sb.append(temp % 2);
            carry = temp / 2;
            i--;
            j--;
        }
        while (i >= 0)
        {
            int temp = carry + a.charAt(i) - '0';
            sb.append(temp%2);
            carry = temp / 2;
            i--;

        }
        while (j >= 0)
        {
            int temp = carry + b.charAt(j) - '0';
            sb.append(temp%2);
            carry = temp/2;
            j--;
        }
        if (carry == 1)
        {
            sb.append(carry);
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args)
    {
        String a = "11";
        String b = "1";
        String r = new addBinary().addBinary(a,b);
        System.out.println(r);
    }
}
