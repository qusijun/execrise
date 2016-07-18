package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/4/5.
 */
public class BestTimeToBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices)
    {
        if (prices.length <= 1)
            return 0;
        //buy[i] 到i的时候,交易以买进股票终止
        //sell[i] 到i的时候,交易以卖出股票终止
        //buy[i] = max(buy[i-1],sell[i-2]-prices[i])
        //sell[i] = max(sell[i-1],buy[i-1]+prices[i])
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        buy[0] = -prices[0];
        sell[0] = 0;
        buy[1] = Math.max(-prices[0],-prices[1]);
        sell[1] = Math.max(0,buy[0]+prices[1]);
        for(int i = 2;i<prices.length;i++)
        {
            buy[i] = Math.max(buy[i-1],sell[i-2]-prices[i]);
            sell[i] = Math.max(sell[i-1],buy[i-1] + prices[i]);
        }
        return sell[prices.length-1];

    }
    public static void main(String[] args)
    {
        int[] prices = {1,2,3,0,2};
        int sum = new BestTimeToBuyAndSellStockWithCooldown().maxProfit(prices);
        System.out.println(sum);
    }

}
