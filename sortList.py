#!/usr/bin/env python
# coding=utf-8
class ListNode:
    def __init__(self,x):
        self.val = x
        self.next = None

def sortList(head):
    listLen = 0
    index = 0
    middle = head
    prefix = head
    cursor = head
    while cursor != None:
        listLen += 1
        cursor = cursor.next
    if listLen == 1:
        return head
    while index < listLen/2:
        index += 1
        prefix = middle
        middle = middle.next
    prefix.next = None
    #print middle.val
    partA = sortList(head)
    partB = sortList(middle)
    #print partA.val
    #print partB.val
    
    
    newhead1 = ListNode(0)
    newhead2 = newhead1

    while partA != None and  partB != None:
        if partA.val < partB.val:
            newhead2.next = partA
            partA = partA.next
        else:
            newhead2.next = partB
            partB = partB.next
        newhead2 = newhead2.next
    if partA == None:
        newhead2.next = partB
    if partB == None:
        newhead2.next = partA
        

    return newhead1.next


def init():
    firstnode = ListNode(0)
    node = firstnode
    l = [1,4,2,7,5,19,2,6]
    for ele in l:
        n = ListNode(ele)
        #print n.val
        node.next = n
        node = node.next
        #print node.val
    return firstnode.next
        
li = init()
sorted = sortList(li)
while sorted != None:
    print sorted.val
    sorted = sorted.next
