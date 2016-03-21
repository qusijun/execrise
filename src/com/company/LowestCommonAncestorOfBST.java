package com.company;
import com.company.TreeNode;
/**
 * Created by qusijun on 16/3/17.
 */
public class LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q)
    {
        if (root == null)
            return null;
        if ((root.val >= p.val && root.val <= q.val) || (root.val <= p.val && root.val >= q.val))
            return root;
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right,p,q);
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left,p,q);
        return null;

    }
}
