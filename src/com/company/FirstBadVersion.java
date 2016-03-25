package com.company;

/**
 * Created by qusijun on 16/3/28.
 */
public class FirstBadVersion {
    public boolean isBadVersion(long version)
    {
        if (version >= 1702766719)
            return true;
        return false;
    }
    public int firstBadVersion(int n)
    {
        //二分查找
        //int mid = n/2;
        int left = 1;
        int right = n;
        int badVersion = 0;
        while (left >= 1 && right <= n && left <= right)
        {
            //不要用mid = (left + right) /2
            //这样会溢出!!!!!切记!!
            int mid = left + (right - left)/2;
            //System.out.println(mid);
            if (isBadVersion(mid))
            {
                right = mid - 1;
                badVersion = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        return badVersion;
    }

    public static void main(String[] args)
    {
        System.out.println(new FirstBadVersion().firstBadVersion(2126753390));
    }
}
