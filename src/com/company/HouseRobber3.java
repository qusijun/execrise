package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qusijun on 16/4/4.
 */
public class HouseRobber3 {
    public int rob(TreeNode root)
    {
        int[] result = dp(root);
        return Math.max(result[0],result[1]);
    }

    public int[] dp(TreeNode root)
    {
        if (root == null)
        {
            return new int[2];
        }
        else
        {
            int[] maxVal = new int[2];
            //maxVal[0]存不包含当前节点所能获得的最大值
            //maxVal[1]存包含当前节点所能获得的最大值
            int[] leftVal = dp(root.left);
            int[] rightVal = dp(root.right);
            maxVal[0] = Math.max(leftVal[0],leftVal[1])+Math.max(rightVal[0],rightVal[1]);
            maxVal[1] = leftVal[0] + rightVal[0] + root.val;
            return maxVal;
         }
    }
}
