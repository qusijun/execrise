package com.company;
import com.company.TreeNode;
/**
 * Created by qusijun on 16/3/17.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p,TreeNode q)
    {
        if (p == null && q == null)
            return true;
        if (p ==null || q == null)
            return false;
        boolean isSameLeft = isSameTree(p.left,q.left);
        boolean isSameRight = isSameTree(p.right,q.right);
        return p.val == q.val && isSameLeft && isSameRight;
    }

}
