import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

n,m=map(int,input().split())
a=[(pos,val)for pos,val in enumerate(list(map(int,input().split())))]
a=deque(a)
cnt=0

while True:
    cur=a.popleft()
    if any(cur[1]<x[1] for x in a):
        a.append(cur)
    else:
        cnt+=1
        if cur[0]==m:
            print(cnt)
            break



