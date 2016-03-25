package com.company;

/**
 * Created by qusijun on 16/3/25.
 */
public class SwapNodesInPairs {
    public Node swapPairs(Node head)
    {
        if (head == null || head.next == null)
            return head;
        Node p,q,root;
        p = new Node(-100);
        q = head.next;
        root = p;
        //result = head.next;
        while (p != null && q != null)
        {
            Node n = q.next;
            if (n == null)
                break;
            q.next = n.next;
            p.next = n;
            n.next = q;
            p = q;
            q = q.next;


        }

        return root.next;

    }
}
