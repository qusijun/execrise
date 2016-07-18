#!/usr/bin/env python
# coding=utf-8
def reverseWords(s):
    sSplit = s.split(' ')
    sSplit.reverse()
    return ' '.join(sSplit)

print reverseWords('the sky is blue')
