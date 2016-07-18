package com.company;
import com.company.TreeNode;
/**
 * Created by qusijun on 16/3/18.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root)
    {
        if (root == null)
            return true;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;
        return isBalanced(root.right) && isBalanced(root.left);
    }

    public int getHeight(TreeNode root)
    {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int leftHeight = 0;
        int rightHeight = 0;
        if (root.left != null)
            leftHeight = getHeight(root.left);
        if (root.right != null)
            rightHeight = getHeight(root.right);
        return (leftHeight > rightHeight?leftHeight:rightHeight) + 1;

    }

}
