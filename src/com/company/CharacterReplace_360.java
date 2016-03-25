package com.company;

import java.util.Scanner;

/**
 * Created by qusijun on 16/3/28.
 */
public class CharacterReplace_360 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            int n,m;
            String s;
            n = scanner.nextInt();
            m = scanner.nextInt();
            s = scanner.next().trim();
            //System.out.println(s);
            char[] array = s.toCharArray();
            for (int i = 0;i<m;i++)
            {
                int x = scanner.nextInt();
                char c = scanner.next().charAt(0);
                //s = s.replace(s.charAt(x-1),c);
                //System.out.println(s);


                array[x-1] = c;
                for (int j= 0;j<array.length;j++)
                    System.out.print(array[j]);
                System.out.println(F(array));

            }
        }

       // System.out.println(new CharacterReplace_360().F(".b..bz...."));
    }

    public static int F(char[] s)
    {

        int count = 0;
        int sum = 0;
        for(int i = 0;i<s.length;i++)
        {
            if (s[i] == '.')
            {
                count++;
            }
            else
            {
                if (count >= 2)
                {
                    sum += (count-1);
                }

                count = 0;

            }
        }
        if (count >= 2)
        {
            sum += (count-1);
        }
        //System.out.println(count);
        return sum;
    }
}
