#!/usr/bin/env python
# coding=utf-8
class ListNode:
    def __init__(self,x):
        self.val = x
        self.next = None

def insertionSortList(head):
    '''this versino will LTE'''
    if head == None or head.next == None:
        return head 
    curNode = head.next
    head.next = None 
    while curNode != None:
        nextNode = curNode.next
        if curNode.val < head.val:
            curNode.next = head
            head = curNode
        else:
            target = head
            #print head.val
            while target.next != None and curNode.val > target.val and curNode.val>target.next.val:
                #print target.val
                target = target.next
            curNode.next = target.next
            target.next = curNode
        curNode = nextNode
    while head != None:
        print head.val
        head = head.next

def insertionSortList(head):
    if not head:
        return head
    nh = ListNode(0)
    nh.next = head
    cur = head

    while cur.next:
        if cur.next.val < cur.val:
            pre = nh
            while pre.next.val < cur.next.val:
                pre = pre.next
            t = cur.next
            cur.next = t.next
            t.next = pre.next
            pre.next = t
        else:
            cur = cur.next
    
    return nh.next

l = []

origin = ListNode(0) 
head = origin
for ele in l:
    n = ListNode(ele) 
    head.next = n
    head = head.next
head = origin.next
#while head != None:
#    print head.val
#    head = head.next

newhead = insertionSortList(head)
while newhead != None:
    print newhead.val
    newhead = newhead.next
