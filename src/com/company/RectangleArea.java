package com.company;

/**
 * Created by qusijun on 16/3/21.
 */
public class RectangleArea {
    public int computeArea(int A,int B,int C,int D,int E,int F,int G,int H)
    {
        int area1 = (C-A) * (D-B);
        int area2 = (G-E) * (H-F);
        int h = Math.max(B,F) > Math.min(D,H)?0:Math.min(D,H) - Math.max(B,F);
        int w = Math.max(A,E) > Math.min(C,G)?0:Math.min(C,G) - Math.max(A,E) ;
        return area1 + area2 - h * w;
    }

}


