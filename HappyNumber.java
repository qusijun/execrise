package com.company;

/**
 * Created by qusijun on 16/3/18.
 */
public class HappyNumber {
    public boolean isHappy(int num)
    {
       // String s = String.valueOf(num);
        int[] visited = new int[1024];
        for(int i = 0;i<visited.length;i++)
            visited[i] = 0;
       // char[] numArr = s.toCharArray();

        while (num != 1)
        {
            int temp = 0;
            String s = String.valueOf(num);
            char[] numArr = s.toCharArray();
            for (int i = 0;i<numArr.length;i++)
            {
                temp += Math.pow(numArr[i] - '0',2);
            }
            num = temp;
            System.out.println(num);
            if (visited[num] == 1)
            {
                return false;
            }
            visited[num] = 1;
        }
        return true;
    }

    public static void main(String[] args)
    {
       // System.out.println('2' - '0');
        System.out.println(new HappyNumber().isHappy(20));
    }
}
