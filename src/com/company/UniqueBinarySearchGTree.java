package com.company;

/**
 * Created by qusijun on 16/4/2.
 */
public class UniqueBinarySearchGTree
{
    public int numTrees1(int n)
    {
        return uniqueBinarySearchTree(1,n);
    }
    //又超时了~sad~
    public int uniqueBinarySearchTree(int left,int right)
    {
        int count = 0;
        if (left >= right)
            return 1;
        else if ((right - left ) == 1)
            return 2;
        else
        {
            for (int i = left;i<=right;i++)
            {
                //count += uniqueBinarySearchTree(left,i-1);
                //count += uniqueBinarySearchTree(i+1,right);
                count += (uniqueBinarySearchTree(left,i-1)*uniqueBinarySearchTree(i+1,right));
            }
        }
        return count;
    }

    //动态规划,存储已经求得的结果
    public int numTrees(int n)
    {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3;i<=n;i++)
        {

            for (int j = 1; j <= i; j++)
            {
                result[i] += (result[j - 1] * result[i - j]);
            }

        }
        return result[n];
    }
    public static void main(String[] args)
    {
        System.out.println(new UniqueBinarySearchGTree().numTrees(19));
    }


}
