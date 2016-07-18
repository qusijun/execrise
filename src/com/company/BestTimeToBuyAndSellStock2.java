package com.company;

import java.util.ArrayList;

/**
 * Created by qusijun on 16/3/30.
 */
public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] nums)
    {
        //数组中的谷底是买的时机
        //数组中的谷顶是卖的时机
        if (nums.length == 0 || nums.length == 1)
            return 0;
        ArrayList<Integer> timeForBuy = new ArrayList<Integer>();
        ArrayList<Integer> timeForSell = new ArrayList<Integer>();
        if (nums[0] < nums[1])
            timeForBuy.add(nums[0]);
        if (nums[nums.length -1] > nums[nums.length - 2])
            timeForSell.add(nums[nums.length-1]);
        for (int i = 1;i<nums.length-1;i++)
        {
            if (nums[i] <= nums[i-1] && nums[i] < nums[i+1])
                timeForBuy.add(nums[i]);
            if (nums[i] > nums[i-1] && nums[i] >= nums[i+1])
                timeForSell.add(nums[i]);
        }

        int sum = 0;
        System.out.println(timeForBuy.size());
        System.out.println(timeForSell.size());
        for (int i = 0;i<timeForBuy.size();i++)
        {
            //System.out.println(i);
            sum += (timeForSell.get(i) - timeForBuy.get(i));
        }
        return sum;



    }

    public static void main(String[] args)
    {
        int[] nums = {0,5,5,6,2,1,1,3};
        int result = new BestTimeToBuyAndSellStock2().maxProfit(nums);
        System.out.println(result);
    }
}
