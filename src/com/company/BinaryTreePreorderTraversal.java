package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/3/31.
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<Integer>();
        preorder(root,result);
        return result;
    }

    public void preorder(TreeNode root,List<Integer> list)
    {
        if (root == null)
            return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right,list);


    }

}
