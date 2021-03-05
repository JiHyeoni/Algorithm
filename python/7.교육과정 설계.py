import sys
from collections import  deque
#sys.stdin = open("input.txt","rt")

a=input()
n=int(input())

for i in range(n):
    s=input()
    dq=deque(a)
    for x in s:
        if x in dq:
            if x!=dq[0]:
                print("#%d NO" %(i+1))
                break
            else:
                dq.popleft()
    else:
        if len(dq)!=0:
            print("#%d NO" % (i + 1))
        else:
            print("#%d YES" % (i + 1))