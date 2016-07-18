package com.company;

import java.util.Scanner;

/**
 * Created by qusijun on 16/4/21.
 */
public class BaiDuColumnSheet {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        for (int i = 0;i<T;i++)
        {
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            if (isRxcy(input))
                System.out.println(rxcyToXy(input));
            else
                System.out.println(xyToRxcy(input));
        }


    }

    public static String rxcyToXy(String rxcy)
    {
        //获取x和y,x是行号,y是列号
        String[] splitByR = rxcy.split("R");
        String[] xAndY = splitByR[1].split("C");
        int x = Integer.parseInt(xAndY[0]);
        int y = Integer.parseInt(xAndY[1]);
        //System.out.println(y);
        //将y转化成字母表示的
        StringBuilder ySB = new StringBuilder();
        while (y > 0)
        {
            int mod = y%26;
            if (mod == 0)
            {
                ySB.append('Z');
                y = y/26-1;
            }
            else
            {
                ySB.append((char)(mod-1+'A'));
                y /= 26;
            }
        }
        //System.out.println(ySB.toString());
        return ySB.reverse().toString()+x;
    }

    public static String xyToRxcy(String xy)
    {
        //首先获得x,也就是用字母表示的列号
        StringBuilder xSB = new StringBuilder();
        String y = "";
        for (int i = 0;i<xy.length();i++)
        {
            if ('A' <= xy.charAt(i) && 'z' >= xy.charAt(i))
                xSB.append(xy.charAt(i));
            else
            {
                y = xy.substring(i);
                break;
            }
        }
        String x = xSB.toString();
        int c = 0;
        int factor = 1;
        for (int i = x.length()-1;i>=0;i--)
        {
            int temp = x.charAt(i)-'A'+1;
            c += (temp * factor);
            factor *= 26;

        }
        return "R"+y+"C"+c;
    }
    //判断输入字符串是否为RxCy形式
    public static boolean isRxcy(String s)
    {
        String[] sSplit = s.split("R");
        if (sSplit.length == 1)
            return false;
        else
        {
            if (sSplit[0].length() > 0)
                return false;
            else
            {
                String[] xAndY = sSplit[1].split("C");
                if (xAndY[0].length() == 0)
                    return false;
                else
                {
                    for (int i = 0;i<xAndY[0].length();i++)
                    {
                        if (xAndY[0].charAt(i) >='A' && xAndY[0].charAt(i) <= 'Z'){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }




}
