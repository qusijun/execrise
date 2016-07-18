package com.company;

/**
 * Created by qusijun on 16/4/7.
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums)
    {
        //no duplicates in array
        //binary search
        int left = 0;
        int right = nums.length-1;
        if(nums[0] <= nums[nums.length-1])
            return nums[0];
        while (left >=0 && right <= nums.length-1 && left <= right)
        {
            int mid = left + (right - left) / 2;
            if (right - left == 1)
                return Math.min(nums[right],nums[left]);
            else if (nums[left] < nums[mid])
                left = mid;
            else
                right = mid;

        }
        return -1;
    }


}
