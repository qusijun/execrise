package com.company;

/**
 * Created by qusijun on 16/4/13.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1,int[] nums2)
    {
        double result;
        int aLen = nums1.length;
        int bLen = nums2.length;
        if ((aLen + bLen) % 2 == 1) {
            result = findK(nums1, nums2, (aLen + bLen) / 2, 0, aLen - 1, 0, bLen - 1);
        }
        else
            result = (findK(nums1,nums2,(aLen+bLen)/2-1,0,aLen-1,0,bLen-1) + findK(nums1,nums2,(aLen+bLen)/2,0,aLen-1,0,bLen-1))*1.0/2;
        return result;
    }

    public int findK(int[] nums1,int[] nums2,int k,int aLeft,int aRight,int bLeft,int bRight)
    {
        if (aLeft > aRight)
            return nums2[k+bLeft];
        if (bLeft > bRight)
            return nums1[k+aLeft];
        if (k == 0)
            return Math.min(nums1[aLeft],nums2[bLeft]);

        int aLen = aRight - aLeft+1;
        int bLen = bRight - bLeft+1;
        int aMid = aLen * k/(aLen+bLen);
        int bMid = (k-aMid-1);
        aMid += aLeft;
        bMid += bLeft;

        if (nums1[aMid] > nums2[bMid])
        {
            k = k - (bMid - bLeft+1);
            aRight = aMid;
            bLeft = bMid + 1;
        }
        else
        {
            k = k - (aMid - aLeft+1);
            bRight = bMid;
            aLeft = aMid + 1;
        }
        return findK(nums1,nums2,k,aLeft,aRight,bLeft,bRight);
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,1,1};
        int[] nums2 = {1,1,1};
        double result = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }

}

