package com.company;

/**
 * Created by qusijun on 16/4/5.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head)
    {
        ListNode faster;
        ListNode slower;
        faster = slower = head;
        while (faster != null && faster.next != null && slower != null)
        {
            faster = faster.next.next;
            slower = slower.next;
            if (faster == slower)
            {
                return true;
            }
        }
        return false;
    }
}
