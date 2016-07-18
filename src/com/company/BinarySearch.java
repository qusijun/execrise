package com.company;

/**
 * Created by qusijun on 16/5/9.
 */

//问题思路:先判断数组是不是纯粹的递增或者递减序列,如果是,则直接二分查找
//如果不是,先找到递增与递减之间的分割点,然后分别在左右两部分进行二分查找.
public class BinarySearch {
    public int findK(int[] nums,int k)
    {
        //寻找分割点即数组中的最大值
        //也是通过二分查找
        int left = 0;
        int right = nums.length-1;
        int pivot = 0;
        while (left >= 0 && right <= nums.length-1 && left <= right)
        {
            int mid = left + (right-left)/2;
            if ((mid == 0 || nums[mid] > nums[mid-1])&&(mid == nums.length-1 || nums[mid] > nums[mid+1])) {
                pivot = mid;
                break;
            }
            else if (mid > 0 && nums[mid] > nums[mid-1])
                left = mid+1;
            else
                right = mid-1;
        }

        if (pivot == 0)
            return decreaseBinarySearch(nums,0,nums.length-1,k);
        else if (pivot == nums.length-1)
            return increaseBinarySearch(nums,0,nums.length-1,k);
        else
        {
            int leftResult = increaseBinarySearch(nums,0,pivot,k);
            int rightResult = decreaseBinarySearch(nums,pivot+1,nums.length-1,k);
            return leftResult == -1?rightResult:leftResult;
        }
    }
    //在递增序列中进行二分查找
    public int increaseBinarySearch(int[] nums,int left,int right ,int k)
    {
        int i = left;
        int j = right;
        while (i >= 0 && j <= right && i <= j)
        {
            int mid = i + (j-i)/2;
            if (nums[mid] == k)
                return mid;
            else if (nums[mid] < k)
                i = mid+1;
            else
                j = mid-1;
        }
        return -1;
    }
    //在递减序列中进行二分查找
    public int decreaseBinarySearch(int[] nums,int left,int right,int k)
    {
        int i = left;
        int j = right;
        while (i >=left && j<= right && i <= j)
        {
            int mid = i+(j-i)/2;
            if (nums[mid] == k)
                return mid;
            else if (nums[mid] < k)
                j = mid-1;
            else
                i = mid+1;
        }
        return -1;
    }


    public static void main(String[] args)
    {
        int[] nums = {7,6,5,4,3};
        int result = new BinarySearch().findK(nums,3);
        System.out.println(result);
    }
}
