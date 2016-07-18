package com.company;

/**
 * Created by qusijun on 16/4/29.
 */
public class InsertionSortList {
    public ListNode insetionSortList(ListNode head)
    {
        if (head.next == null)
            return head;
        ListNode hook = new ListNode(-100);
        hook.next = head;
        ListNode start = head.next;
        ListNode pre1 = hook;
        ListNode pre2 = head;
        ListNode next = null;
        while (start != null)
        {

            next = start.next;
            System.out.println(start.val);
            pre1 = hook;
            //pre2 = start;
            ListNode p = hook.next;
            while (p != null && p.val < start.val)
            {
                pre1 = p;
                p = p.next;
            }
            //System.out.println(pre1.val);
            if (p != start)
            {
                pre2.next = next;
                start.next = pre1.next;
                pre1.next = start;
            }
            else
                pre2 = pre2.next;
            start = next;

        }
        return hook.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(1);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(1);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = null;
        p4.next = null;
        ListNode result = new InsertionSortList().insetionSortList(head);
        while (result != null)
        {
            System.out.println(result.val);
            result= result.next;
        }


    }
}
