#!/usr/bin/env python
# coding=utf-8
class Point():
    def __init__(self,x=0,y=0):
        self.x = x
        self.y = y


def maxPoints1(points):
#    firstPoint = points[0]
#    secondPoint = None
#    for point in points:
#        if point.x != firstPoint.x or point.y != firstPoint.y:
#            secondPoint = point
#    numPoints = len(points)
#    for i in range(numPoints):
#        firstPoint = points[i]
#        for j in range(i+1,numPoints):
#            if points[j].x != firstPoint.x or points[j].y != firstPoint.y:
#                secondPoint = points[j]
#                break
    slopeDict = {}
    pointNum = len(points)
    for i in range(pointNum):
        pointA = points[i]
        for j in range(i+1,pointNum):
            pointB = points[j]
            ysub = pointB.y - pointA.y
            xsub = pointB.x - pointA.x
            slopGcd = gcd(ysub,xsub)
            if slopGcd == 0:
                slop =(0,1)
            else:
                slop = (ysub/slopGcd,xsub/slopGcd)
            
            if slopeDict.has_key(slop):
                slopeDict[slop] +=1
            else:
                slopeDict[slop] = 2
    max = 0
    for key in slopeDict.keys():
        if slopeDict[key]>max:
            max = slopeDict[key]

    return max

def gcd(a,b):
    while b != 0:
        tmp = a%b
        a = b
        b = tmp

    return abs(a)
#print gcd(6,-4)

points = [Point(1,2),Point(4,2),Point(5,2),Point(2,4),Point(3,6),Point(1,7)] 
points = [Point(0,0),Point(0,0)]
points = [Point(2,3),Point(3,3),Point(-5,3)]
#print maxPoints(points)

from fractions import Fraction 
def maxPoints(points):
    INFI = 2**10
    numDict = {}
    points = [(point.x,point.y) for point in points]
    print points
    pointSet = list(set(points))
    for point in pointSet:
        numDict[point] = 0 
    for point in points:
        for key in numDict.keys():
            if point[0] == key[0] and point[1] == key[1]:
                numDict[key] +=1
    print numDict
    print pointSet
    slopeDict = {}
    k = []
    i = 0
    for pointA in pointSet:
        for pointB in pointSet:
            if pointA == pointB:
                slopeDict[-INFI] = numDict[(pointA[0],pointA[1])]
            else:
                if pointA[0] == pointB[0]:
                    if slopeDict.has_key(Fraction(INFI,1)):
                        slopeDict[INFI] += numDict[(pointB[0],pointB[1])]
                    else:
                        slopeDict[INFI] = numDict[(pointA[0],pointA[1])]+numDict[pointB[0],pointB[1]]
                else:
                    #slope = Fraction(pointB[1]-pointA[1],pointB[0]-pointA[0])
                    slope = float((pointA[1]-pointB[1])*1.0/(pointA[0]-pointB[0]))
                    if slopeDict.has_key(slope):
                        slopeDict[slope] +=  numDict[(pointB[0],pointB[1])]
                    else:
                        slopeDict[slope] = numDict[(pointA[0],pointA[1])] + numDict[(pointB[0],pointB[1])]
        k.insert(i,0)
        print slopeDict
        for key in slopeDict.keys():
            if k[i] < slopeDict[key]:
                k[i] = slopeDict[key]
        slopeDict = {}
        i+=1

    if len(k) == 0:
        m = 0
    else:
        m = max(k)
    return m



                



print maxPoints(points)


