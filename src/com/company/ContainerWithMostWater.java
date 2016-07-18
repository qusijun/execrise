package com.company;

/**
 * Created by qusijun on 16/4/11.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height)
    {
        //左右两个指针
        //如果左边指针指向的height比右边指针指向的height小,那么左指针向右边移动
        //同样的道理,如果右边指针指向的height比左边指针指向的height小,那么右指针向左移动
        int i = 0;
        int j = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (i < j)
        {
            int temp = Math.min(height[j],height[i])*(j-i);
            if (max < temp)
                max = temp;
            if (height[j] < height[i])
                j--;
            else
                i++;

        }
        return max;
    }

}
