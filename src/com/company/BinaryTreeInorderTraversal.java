package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/3/31.
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<Integer>();
        inorder(root,result);
        return result;
    }

    public void inorder(TreeNode root,List<Integer> list)
    {
        if (root == null)
            return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }


}
