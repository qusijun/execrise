package com.company;

import apple.laf.JRSUIUtils;

/**
 * Created by qusijun on 16/3/16.
 */
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val = val;
    }
}
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root)
    {
        int maxLeft = 0;
        int maxRight = 0;
        if (root == null)
        {
            return 0;
        }
        if (root.left == null && root.right == null)
        {
            return 1;
        }
        if (root.left != null)
        {
            maxLeft = maxDepth(root.left);
        }

        if(root.right != null)
        {
            maxRight = maxDepth(root.right);
        }
        return (maxLeft>maxRight?maxLeft:maxRight) + 1;


    }

    public static void main(String[] args)
    {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t1.left = t2;
        int result = new MaximumDepthOfBinaryTree().maxDepth(t1);
        System.out.println(result);
    }
}
