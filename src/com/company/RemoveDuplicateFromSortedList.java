package com.company;
import com.company.Node;
/**
 * Created by qusijun on 16/3/18.
 */
public class RemoveDuplicateFromSortedList {
    public Node deleteDuplicates(Node head)
    {
        if (head == null)
            return null;
        Node pre = head;
        Node result = head;
        while (head != null && head.next != null )
        {
            if (head.val != head.next.val)
            {
                pre.next = head.next;
                pre = pre.next;
            }
            head = head.next;

        }
        System.out.println(pre.val+","+head.val);
        if (head.val == pre.val)
            pre.next = null;

        return result;

    }

    public static void main(String[] args)
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(3);
        n1.next = n2;
        n2.next = null;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node r = new RemoveDuplicateFromSortedList().deleteDuplicates(n1);
        while (r != null)
        {
            System.out.print(r.val + ",");
            r = r.next;
        }
    }
}
