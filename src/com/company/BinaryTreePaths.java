package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qusijun on 16/3/25.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root)
    {
        List<String> result = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        getPath(root,result,sb);
        return result;
    }
    //递归边界是访问的节点是叶子节点
    //此时将得到的路径添加到结果集合中
    //另外一个重点是对StringBuilder中的元素进行清理
    //也就是回溯
    public void getPath(TreeNode root,List<String> result,StringBuilder sb)
    {
        if (root == null)
            return ;
        int len = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null)
        {
            result.add(sb.toString());
        }
        else
        {
            sb.append("->");
            getPath(root.left, result, sb);
            getPath(root.right,result,sb);
        }
        sb.setLength(len);
    }


    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        sb.setLength(2);
        sb.append(4);

        String s = "woshi";
        String t = s.substring(0,2);
        System.out.println(t);

    }
}
