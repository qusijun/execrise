package com.company;

import java.util.Scanner;

/**
 * Created by qusijun on 16/4/6.
 */
public class FontSize {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int tasks = scanner.nextInt();
        for (int i = 0;i<tasks;i++)
        {
            int N,P,W,H;
            N = scanner.nextInt();
            P = scanner.nextInt();
            W = scanner.nextInt();
            H = scanner.nextInt();
            //int totalHeight = P * H;

            int left = 0;
            int[] paragraphs = new int[N];
            for (int j = 0;j<N;j++)
            {
                paragraphs[i] = scanner.nextInt();
            }
            int papers = P;
            int maxFont = Math.min(W,H);
            int font = maxFont;
            int totalLines = 0;
            for (;font>=1;font--)
            {
                for (int j = 0;j<N;j++)
                {
                    int charsOneLine = W / font;
                    int lines = (int)Math.ceil(paragraphs[i]*1.0/charsOneLine);
                    //System.out.println(lines);
                    totalLines += lines;

                }
                if (totalLines * font > P*H)
                    continue;
                else
                {
                    System.out.println(font);
                    break;
                }
            }
        }
    }

}
