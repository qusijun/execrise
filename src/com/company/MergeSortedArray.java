package com.company;

/**
 * Created by qusijun on 16/3/20.
 */
public class MergeSortedArray {
    public void merge(int[] nums1,int m,int[] nums2,int n)
    {
        //num1有足够的空间保存合并后的数组
        int i,j,k;

        i = 0;
        j = 0;
        k = 0;

        int[] temp = new int[m + n];
        while (i < m && j < n)
        {
            if (nums1[i] < nums2[j])
            {
                temp[k++] = nums1[i++];
            }
            else
            {
                temp[k++] = nums2[j++];
            }
        }

        while (i < m)
        {
            temp[k++] = nums1[i++];
        }

        while (j < n)
        {
            temp[k++] = nums2[j++];
        }

        for (int p = 0;p<temp.length;p++)
            nums1[p] = temp[p];
    }
}
