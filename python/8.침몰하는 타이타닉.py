import sys
from collections import deque
#sys.stdin = open("input.txt","rt")

n,m=map(int,input().split())
a=list(map(int,input().split()))
a.sort()
a=deque(a)
cnt=0

while a:
    if len(a)==1:
        cnt+=1
        break
    else:
        if a[0]+a[-1]<=m:
            cnt+=1
            a.popleft()
            a.pop()
        elif a[0]+a[-1]>m:
            cnt+=1
            a.pop()
print(cnt)

