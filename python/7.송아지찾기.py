import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

MAX=100000
s,e=map(int,input().split())
ch=[0]*MAX
dis=[0]*MAX
dQ=deque()
dQ.append(s)
ch[s]=1
dis[s]=0

while True:
    now=dQ.popleft()
    if now==e:
        break
    else:
        for next in (now-1,now+1,now+5):
            if 0<next<=MAX:
                if ch[next]==0:
                    ch[next]=1
                    dQ.append(next)
                    dis[next]=dis[now]+1
print(dis[e])