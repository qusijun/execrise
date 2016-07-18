package com.company;

import java.util.Stack;

/**
 * Created by qusijun on 16/4/17.
 */
public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    private int min;
    public BSTIterator(TreeNode root)
    {
        while (root != null)
        {
            stack.push(root);
            root = root.left;
        }

    }

    public boolean hasNext()
    {
        if (!stack.isEmpty())
        {
            TreeNode cur = stack.pop();
            min = cur.val;
            TreeNode curRight = cur.right;
            if (curRight != null)
            {
                stack.push(curRight);
                curRight = curRight.left;
                while (curRight != null)
                {
                    stack.push(curRight);
                    curRight = curRight.left;
                }
            }
            return true;
        }
        return false;
    }

    public int next()
    {
        return min;
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        root.right = right;

        BSTIterator bsti = new BSTIterator(root);
        while(bsti.hasNext())
        {
            System.out.println(bsti.next());
        }
    }
}
