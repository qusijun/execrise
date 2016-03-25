package com.company;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by qusijun on 16/3/28.
 */
public class MinStack {
    private Stack stack = new Stack();
    private int min = Integer.MAX_VALUE;
    private HashMap map = new HashMap();
    private int index = 0;
    public void push(int x)
    {
        this.stack.push(x);
        if (index >= 1)
            min = (int)map.get(index-1);
        if (min > x)
            min = x;
        map.put(index++,min);

    }
    public void pop()
    {
        stack.pop();
        map.remove(--index);
        if (index == 0)
            min = Integer.MAX_VALUE;

    }
    public int top()
    {
        return (int)stack.peek();
    }

    public int getMin()
    {
        return (int)map.get(index - 1);
    }

    public static void main(String[] args)
    {
        MinStack ms = new MinStack();
        ms.push(2147483646);
        ms.push(2147483646);
        ms.push(2147483647);

        //System.out.println(ms.index);
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println("min=" + ms.min);
        ms.push(2147483647);
        System.out.println(ms.getMin());
        ms.push(-2147483648);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());


    }
}
