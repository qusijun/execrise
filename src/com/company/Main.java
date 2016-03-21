package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(new Main().countAndSay(4));
    }

    public String countAndSay(int n) {

        StringBuilder sb = new StringBuilder();
        int count = 1;
        int i = 1;
        String pre = "1";
        while(i < n)
        {
            System.out.println(pre);
            int j;
            for (j = 1;j<pre.length();j++)
            {
                if (pre.charAt(j) == pre.charAt(j-1))
                {
                    count++;
                }
                else
                {
                    sb.append(count);
                    sb.append(pre.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(pre.charAt(j-1));
            pre = sb.toString();
            sb = new StringBuilder();
            count = 1;
            i++;
            //System.out.println(pre);
        }

        return pre;

    }
}
