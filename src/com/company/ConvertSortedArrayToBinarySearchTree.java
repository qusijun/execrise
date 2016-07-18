package com.company;

/**
 * Created by qusijun on 16/4/11.
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums)
    {
        return sortedArrayToBST(nums,0,nums.length-1);
    }

    public TreeNode sortedArrayToBST(int[] nums,int left,int right)
    {
        if (left > right)
            return null;
        if (left == right)
            return new TreeNode(nums[left]);
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        TreeNode leftChild = sortedArrayToBST(nums,left,mid-1);
        TreeNode rightChild = sortedArrayToBST(nums,mid+1,right);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }


}
