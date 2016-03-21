package com.company;

/**
 * Created by qusijun on 16/3/16.
 */
import com.company.TreeNode;
public class InvertBinaryTree {
    public TreeNode invertBinaryTree(TreeNode root)
    {
        if (root == null)
        {
            return null;
        }
        TreeNode leftInverted = null;
        TreeNode rightInverted = null;
        if(root.left != null)
        {
            leftInverted = invertBinaryTree(root.left);
        }
        if(root.right != null)
        {
            rightInverted = invertBinaryTree(root.right);
        }
        root.left = rightInverted;
        root.right = leftInverted;


        return root;

    }


}
