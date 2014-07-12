#!/usr/bin/env python
# coding=utf-8
class ListNode:
    def __init__(self,x):
        self.val = x
        self.next = None

def insertionSortList(head):
    curNode = head.next
    preNode = head 
    target = head
    while curNode != None:
        nextNode = curNode.next
        while curNode.val > target.val:
            target = target.next
        preNode.next = curNode.next
        curNode.next = target.next
        target.next = curNode
        preNode = preNode.next
        curNode = nextNode
            
