package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/4/4.
 */
public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root,int k)
    {
        List<Integer> BSTList = new ArrayList<Integer>();
        BST2List(root,BSTList);
        return BSTList.get(k-1);

    }
    public void BST2List(TreeNode root,List BSTList)
    {
        if (root == null)
            return ;
        BST2List(root.left,BSTList);
        BSTList.add(root.val);
        BST2List(root.right,BSTList);
    }


}
