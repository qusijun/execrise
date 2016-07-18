package com.company;
import com.company.TreeNode;
/**
 * Created by qusijun on 16/3/18.
 */
public class SymmetricTree {
    //可以看成如果判断两个树是否对称
    public boolean isSymmetric(TreeNode root)
    {
        if (root == null)
            return true;
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode p,TreeNode q)
    {
        if (p == null && q == null)
            return true;
        if (p == null || q ==null)
            return false;
        return p.val == q.val  && isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);
    }

}
