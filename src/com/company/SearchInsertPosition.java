package com.company;

/**
 * Created by qusijun on 16/4/4.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums,int target)
    {
        int left = 0;
        int right = nums.length-1;
        while (left >= 1 && right < nums.length && left <= left)
        {
            if (right == left)
            {
                if (nums[right] == target )
                    return right;
                else if (nums[right] > target)
                    return right-1;
                else
                    return right+1;
            }
            else if (right - left == 1)
            {
                if (nums[left] >= target)
                    return left;
                if (nums[right] == target)
                    return right;
                if (nums[left]<target && target<nums[right])
                    return right;
                if (nums[right] < target)
                    return right+1;
            }
            else
            {

                int mid = left + (right - left) / 2;
                if (nums[mid] == target)
                    return mid;
                if (nums[mid + 1] == target)
                    return mid+1;
                if (nums[mid] < target && nums[mid+1] > target)
                    return mid+1;
                if (nums[mid] > target)
                {
                    if (mid == 0)
                        return 0;
                    right = mid -1;
                }
                else if(nums[mid+1] < target)
                {
                    if (mid + 1 == nums.length-1)
                        return nums.length;
                    left = mid+2;
                }
            }
        }
        return -1;
    }

}
