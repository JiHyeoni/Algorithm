import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

s,e=map(int,input().split())
MAX=100000
dis=[0]*MAX
ch=[0]*MAX
dQ=deque()
dis[s]=0
ch[s]=1
dQ.append(s)

while dQ:
    now=dQ.popleft()
    if now==e:
        break
    for next in (now-1,now+1,now+5):
        if 0<next<=MAX:
            if ch[next]==0:
                dQ.append(next)
                ch[next]=1
                dis[next]=dis[now]+1
print(dis[e])