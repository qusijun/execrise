package com.company;

import java.util.Stack;

/**
 * Created by qusijun on 16/3/18.
 */
public class ImplementQueueUsingStacks {
    private Stack<Integer> stack = new Stack<Integer>();
    public void push(int x)
    {
        stack.push(x);
    }
    public void pop()
    {
        Stack<Integer> s = new Stack<Integer>();
        while (!stack.isEmpty())
            s.push(stack.pop());
        s.pop();
        while (!s.empty())
            stack.push(s.pop());
    }
    public int peek()
    {
        Stack<Integer> s = new Stack<Integer>();
        while (!stack.isEmpty())
            s.push(stack.pop());
        int result = s.peek();
        while (!s.isEmpty())
            stack.push(s.pop());
        return result;
    }

    public boolean empty()
    {
        return stack.isEmpty();
    }


}
