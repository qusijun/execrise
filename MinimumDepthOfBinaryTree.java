package com.company;

/**
 * Created by qusijun on 16/3/20.
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root)
    {
        if (root == null)
            return 0;
        int minRight = minDepth(root.right);
        int minLeft = minDepth(root.left);
        if (root.left == null)
            return minRight+1;
        if (root.right == null)
            return minLeft + 1;
        return (minRight < minLeft?minRight:minLeft) + 1;
    }

}
