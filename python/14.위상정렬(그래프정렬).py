import sys
from collections import deque
sys.stdin = open("input.txt", 'r')

n,m=map(int,input().split())
dis=[[0]*n for _ in range(n)]
dy=[0]*n
Q=deque()
for i in range(m):
    a,b=map(int,input().split())
    dis[a-1][b-1]=1
    dy[b-1]+=1

for i in range(n):
    if dy[i]==0:
        Q.append(i)
        
while Q:
    x=Q.popleft()
    print(x+1,end=' ')
    for i in range(n):
        if dis[x][i]==1:
            dy[i]-=1
            if dy[i]==0:
                Q.append(i)