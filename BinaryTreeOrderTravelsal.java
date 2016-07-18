package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qusijun on 16/3/19.
 */
public class BinaryTreeOrderTravelsal {
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //row.add(root.val);
        if(root == null)
        {

            return result;
        }
        queue.add(root);
        while (!queue.isEmpty())
        {
            List<Integer> row = new ArrayList<Integer>();
            Queue<TreeNode> tempQueue = new LinkedList<TreeNode>();
            while(!queue.isEmpty())
            {
                TreeNode temp = queue.poll();
                row.add(temp.val);
                if (temp.left != null)
                    tempQueue.add(temp.left);
                if(temp.right != null)
                    tempQueue.add(temp.right);
            }
            result.add(row);
            queue = tempQueue;


        }
        return result;
    }

}
