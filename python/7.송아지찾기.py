import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

MAX=100000
s,e=map(int,input().split())
dis=[0]*MAX
ch=[0]*MAX
dQ=deque()
dis[s]=0
ch[s]=1
dQ.append(s)
while dQ:
    now=dQ.popleft()
    if e==now:
        break
    for next in (now-1,now+1,now+5):
        if 0<next<=MAX:
            if ch[next]==0:
                ch[next]=1
                dQ.append(next)
                dis[next]=dis[now]+1
print(dis[e])