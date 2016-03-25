package com.company;

/**
 * Created by qusijun on 16/3/25.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head,int val)
    {
        ListNode root = new ListNode(-100);
        root.next = head;
        ListNode pre,cur;
        pre = root;
        cur = head;
        while (cur != null )
        {
            if (cur.val == val)
            {
                pre.next = cur.next;
                cur = cur.next;
            }
            else
            {
                pre = cur;
                cur = cur.next;
            }
        }
        return root.next;
    }


}
