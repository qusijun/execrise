package com.company;
import com.company.Node;
/**
 * Created by qusijun on 16/3/18.
 */
public class MergeTwoSortedList {
    public Node mergeTwoLists(Node l1,Node l2)
    {
        Node head = new Node(-100);
        Node p = head;
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val)
            {
                head.next = l1;
                l1 = l1.next;
            }
            else
            {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }

        if (l1 != null)
            head.next = l1;
        if (l2 != null)
            head.next = l2;

        return p.next;

    }

    public static void main(String[] args)
    {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(2);
        Node n4 = new Node(4);
        n1.next = null;
        n2.next = null;
        n3.next = n4;
        n4.next = null;
        Node head = new MergeTwoSortedList().mergeTwoLists(n1,n3);
        while (head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
