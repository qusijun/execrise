#!/usr/bin/env python
# coding=utf-8
def evalRPN(tokens):
    nums = []
    for ele in tokens:
        if ele != '+' and ele != '-' and ele != '*' and ele != '/':
            nums.append(ele)
        else:
            arith2 = int(nums.pop())
            arith1 = int(nums.pop())
            print arith1,arith2
            if ele == '+':
                nums.append(arith1+arith2)
            elif ele == '-':
                nums.append(arith1-arith2)
            elif ele == '*':
                nums.append(arith1*arith2)
            elif ele == '/':
                if arith1 * arith2< 0:
                    nums.append(0-abs(arith1)/abs(arith2))
                else:
                    nums.append(arith1/arith2)

    return nums[0]

print evalRPN(['4','5','+','8','*'])
print evalRPN(['10','6','9','3','+','-11','*','/','*','17','+','5','+'])
    
