package com.company;

/**
 * Created by qusijun on 16/3/20.
 */
public class IntersectionOfTwoLinkedList {
    public Node getIntersectionNode(Node headA,Node headB)
    {
        if (headA == null || headB == null)
            return null;
        Node a1,b1,a2,b2;
        a1 = headA;
        a2 = headA;
        b1 = headB;
        b2 = headB;
        while (a1 != null && b1 != null)
        {
            a1 = a1.next;
            b1 = b1.next;
        }

        if (a1 == null)
        {
            while (b2 != null && b1 != null)
            {
                b2 = b2.next;
                b1 = b1.next;
            }

            while (a2 != null && b2 != null)
            {
                if (a2.val == b2.val)
                    return a2;
                a2 = a2.next;
                b2 = b2.next;
            }

        }
        else
        {
            while (a2 != null && a1 != null)
            {
                a2 = a2.next;
                a1 = a1.next;
            }

            while (a2 != null && b2 != null)
            {
                if (a2.val == b2.val)
                    return a2;
                a2 = a2.next;
                b2 = b2.next;
            }
        }

        return null;




    }

}
