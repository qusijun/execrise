package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qusijun on 16/4/23.
 */
public class UniqueBinarySearchTrees2 {
    public List<TreeNode> generateTrees(int n)
    {
        if (n <= 0)
            return new ArrayList();
        return uniqueBinarySearchTree(1, n);
    }
    public List<TreeNode>  uniqueBinarySearchTree(int left,int right)
    {
        List<TreeNode> result  = new ArrayList();
        if (left > right)
        {
            result.add(null);
            //return result;
        }
        else if (left == right)
        {
            result.add(new TreeNode(left));
            //return result;
        }
        else
        {
            for (int i = left;i<=right;i++)
            {
                List<TreeNode> leftList = uniqueBinarySearchTree(left,i-1);
                List<TreeNode> rightList = uniqueBinarySearchTree(i+1,right);
                for (TreeNode leftNode :leftList)
                    for(TreeNode rightNode:rightList)
                    {
                        TreeNode root = new TreeNode(i);
                        root.left = leftNode;
                        root.right = rightNode;
                        result.add(root);
                    }
            }
            //return result;
        }
        return result;

    }

    public static void main(String[] args)
    {
        List<TreeNode> result = new UniqueBinarySearchTrees2().generateTrees(3);
        for (TreeNode node:result)
            System.out.println(node.val);
    }


}
