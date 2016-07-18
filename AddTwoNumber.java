package com.company;

/**
 * Created by qusijun on 16/3/14.
 */
class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
    }
}
public class AddTwoNumber {
    public static void main(String[] args)
    {
        Node l1 = new Node(2);
        Node l2 = new Node(4);
        Node l3 = new Node(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        Node p1 = new Node(5);
        Node p2 = new Node(6);
        Node p3 = new Node(9);
        p1.next = p2;
        p2.next = p3;
        p3.next = null;
        Node result = new AddTwoNumber().addTwoNumber(l1,p1);
        while (result != null)
        {
            System.out.print(result.val + "->");
            result = result.next;
        }

    }
    public Node addTwoNumber(Node l1,Node l2)
    {
        Node p1 = l1;
        Node p2 = l2;
        Node pre = null;

        //Node result = new Node(0);
        int carry = 0;
        while (p1 != null && p2 != null)
        {
            p1.val = p1.val + p2.val + carry;
            carry = p1.val/10;
            p1.val %= 10;
            pre = p1;
            p1 = p1.next;
            p2 = p2.next;

        }
        //两个链表长度不相等
        while (p1 != null)
        {
            p1.val += carry;
            carry = p1.val / 10;
            p1.val %= 10;
            pre = p1;
            p1.next = p1;
        }
        while (p2 != null)
        {
            pre.next = p2;
            p2.val +=carry;
            carry = p2.val / 10;
            p2.val %= 10;
            pre = p2;
            p2 = p2.next;
        }
        if (carry > 0)
        {
            Node last = new Node(carry);
            pre.next = last;
        }
        return l1;

    }

    public int getLen(Node p)
    {
        int count = 0;
        while (p != null)
        {
            count++;
            p = p.next;
        }
        return count;
    }



}
