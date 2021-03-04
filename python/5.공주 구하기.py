import sys
from collections import deque
#sys.stdin = open("input.txt","rt")

n,k=map(int,input().split())
a=list(range(1,n+1))
a=deque(a)
m=1
while len(a)!=1:
    if m!=k:
        a.append(a.popleft())
        m+=1
    elif m==k:
        a.popleft()
        m=1
print(a[0])
'''
import sys
from collections import deque
sys.stdin=open("input.txt", "r")

n, k=map(int, input().split())
q=list(range(1, n+1))
dq=deque(q)

while dq:
    for _ in range(k-1):
        cur=dq.popleft()
        dq.append(cur)
    dq.popleft()
    if len(dq)==1:
        print(dq[0])
        dq.popleft()
'''