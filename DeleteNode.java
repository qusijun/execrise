package com.company;
import com.company.Node;
/**
 * Created by qusijun on 16/3/16.
 */
public class DeleteNode {
    public void deleteNode(Node node)
    {
        //node是要删除的节点
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
