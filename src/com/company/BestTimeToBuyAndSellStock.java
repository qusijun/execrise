package com.company;

/**
 * Created by qusijun on 16/4/5.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices)
    {
        if (prices.length == 0 || prices.length == 1)
            return 0;
        int curMin = 0;
        int max = 0;
        for (int i=0;i<prices.length;i++)
        {
            if (prices[i] >= prices[curMin])
            {
                if (prices[i] - prices[curMin] > max) {
                    max = prices[i] - prices[curMin];
                }
            }
            else
            {
                curMin = i;
            }

        }
        return max;

    }

    public static void main(String[] args)
    {
        int[] prices = {6,1,3,2,4,7};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));
    }
}
