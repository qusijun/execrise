package com.company;
import com.company.Node;
/**
 * Created by qusijun on 16/3/17.
 */
public class OldEvenLinkedList {
    public Node oddEvenLinkedList(Node head)
    {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        Node head1;
        Node head2;
        Node evenHead;
        Node head1Pre;
        head1 = head;
        head2 = head.next;
        evenHead = head2;
        //head1Pre = head;
        while (head1 != null && head1.next != null && head2.next != null)
        {
            //head1Pre= head1;
            head1.next = head2.next;
            head1 = head1.next;

            head2.next = head1.next;
            head2 = head2.next;

        }

        //head1Pre = head1;
        head1.next = evenHead;
        return head;
    }
    public static void main(String[] args)
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = null;
        n2.next = null;
        n3.next = null;
        n4.next = null;
        new OldEvenLinkedList().oddEvenLinkedList(n1);
        while(n1 != null)
        {
            System.out.println(n1.val + ",");
            n1 = n1.next;
        }
    }
}
