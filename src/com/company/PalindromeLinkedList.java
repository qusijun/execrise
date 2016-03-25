package com.company;

/**
 * Created by qusijun on 16/3/26.
 */
public class PalindromeLinkedList {
    //将整个链表反转这种方法会超时,一开始就想到会超时啦,科科!
    //但是可以将后半个链表反转
    public boolean isPalindrome(ListNode head)
    {
        ListNode midNode = getMid(head);
        ListNode reverseedList = reverse(midNode);
        ListNode p = head;
        ListNode q = reverseedList;
        while (p != null && q != null)
        {

            if (p.val != q.val)
                return false;
            p = p.next;
            q = q.next;
        }
        return true;

    }

    public ListNode reverse(ListNode head)
    {
        //ListNode root = new ListNode(-100);
        ListNode pre;
        ListNode cur;
        pre = null;
        cur = head;
        while (cur != null)
        {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode getMid(ListNode head)
    {
        ListNode p = head;
        ListNode q = head;
        while (p != null && q != null && q.next != null)
        {
            p = p.next;
            q = q.next.next;
        }
        return p;
    }


    public static void main(String[] args)
    {
        ListNode n1 = new ListNode(1);
        n1.next = null;
        System.out.println(new PalindromeLinkedList().isPalindrome(n1));
    }


}
