package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qusijun on 16/3/20.
 */
public class ImplementStackUsingQueues {
    Queue<Integer> stack = new LinkedList<Integer>();
    public void push(int x)
    {
        stack.add(x);
    }

    public void pop()
    {
        Queue<Integer> q = new LinkedList<Integer>();
        while (stack.size() > 1)
        {
            int temp = stack.remove();
            q.add(temp);
        }
        stack.remove();
        while (!q.isEmpty())
        {
            stack.add(q.remove());
        }

    }

    public int top()
    {
        Queue<Integer> q = new LinkedList<Integer>();
        while (stack.size() > 1)
        {
            q.add(stack.remove());
        }
        int result = stack.remove();
        while (!q.isEmpty())
        {
            stack.add(q.remove());
        }
        stack.add(result);
        return result;
    }

    public boolean empty()
    {
        return stack.isEmpty();
    }


}
