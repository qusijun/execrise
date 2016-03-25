package com.company;

import java.util.Scanner;

/**
 * Created by qusijun on 16/3/28.
 */
public class NumGame_360 {
    //当b>n/2时候 a = b-1
    //当b<n/2时候 a = b+1
    //当b = n/2时候 a = b+1
    public static void main(String[] args)
    {
        int n,b;
        //int a;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            //String[] input = scanner.nextLine().trim().split(" ");
            //n = Integer.parseInt(input[0]);
            //b = Integer.parseInt(input[1]);
            n = scanner.nextInt();
            b = scanner.nextInt();
            if (b <= n/2)
                System.out.println(b+1);
            else
                System.out.println(b-1);

        }
    }
}
