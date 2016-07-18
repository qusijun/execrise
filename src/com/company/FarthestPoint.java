package com.company;

import java.util.Scanner;

/**
 * Created by qusijun on 16/4/4.
 */
public class FarthestPoint {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        float x,y,radius;
        float dis = 0;
        while (s.hasNext())
        {
            x = s.nextFloat();
            y = s.nextFloat();
            radius = s.nextFloat();
            int tempx = 0;
            int tempy = 0;
            for (int i = (int)(x-radius);i<=(int)(x+radius);i++)
            {
                for (int j = (int)(y-radius);j<=(int)(y+radius);j++)
                {
                    float temp = (i-x)*(i-x)+(j-y)*(j-y);
                    if ( temp <= (radius * radius) && dis <=temp )
                    {
                        dis = temp;
                        tempx = i;
                        tempy = j;
                    }
                }
            }
            System.out.println(tempx+" "+tempy);
        }
    }
}
