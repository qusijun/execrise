package com.company;

import java.util.Stack;

/**
 * Created by qusijun on 16/3/25.
 */
public class ValidParentheses {
    public boolean isValid(String s)
    {
        if (s.length() % 2 == 1)
        {
            return false;
        }
        if (s.length() == 0)
        {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        //boolean flag = true;
        for (int i= 1;i<s.length();i++)
        {
            if (!stack.isEmpty())
            {
                char temp = stack.peek();
                if ((s.charAt(i) == ')' && temp == '(') || (s.charAt(i) == ']' && temp == '[') || (s.charAt(i) == '}' && temp == '{'))
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
            else
            {
                stack.push(s.charAt(i));
            }

        }
        return stack.isEmpty();
    }
}
