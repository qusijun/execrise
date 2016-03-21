package com.company;
import com.company.TreeNode;
/**
 * Created by qusijun on 16/3/19.
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root,int sum)
    {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.val == sum)
            return true;
        return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);

    }


}
