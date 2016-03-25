package com.company;

/**
 * Created by qusijun on 16/3/25.
 */
class ListNode
{
    int val;
    ListNode next;
    ListNode(int val)
    {

        this.val = val;
    }

}
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head,int n)
    {
        ListNode p,q,pre,root;
        p = head;
        q = head;
        root = new ListNode(-100);
        root.next = head;
        pre = root;
        int index = 0;
        while (index < n)
        {
            p = p.next;
            index++;
        }
        while (p != null)
        {
            pre = q;
            p = p.next;
            q = q.next;
        }

        pre.next = q.next;
        return root.next;



    }

}
