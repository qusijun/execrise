package com.company;
import com.company.Node;
/**
 * Created by qusijun on 16/3/17.
 */
public class ReverLinkedList {
    public Node reverseList(Node head)
    {
        if(head == null)
        {
            return null;
        }
        Node pre,cur,next;
        pre = null;
        cur = head;
        while (cur != null)
        {
            Node temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;

        }
        return pre;
    }

    public static void main(String[] args)
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        n2.next = null;
        n1 = new ReverLinkedList().reverseList(n1);
        while (n1 != null)
        {
            System.out.print(n1.val+">");
            n1 = n1.next;
        }
    }

}
