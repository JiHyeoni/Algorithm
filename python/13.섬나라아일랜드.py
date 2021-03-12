import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

dx=[1,0,-1,0,-1,1,-1,1]
dy=[0,-1,0,1,-1,1,1,-1]

n=int(input())
a=[list(map(int,input().split()))for _ in range(n)]
Q=deque()
cnt=0
for i in range(n):
    for j in range(n):
        if a[i][j]==1:
            Q.append((i,j))
            a[i][j]=0
            while Q:
                tmp=Q.popleft()
                for k in range(8):
                    x = tmp[0] + dx[k]
                    y = tmp[1] + dy[k]
                    if x<0 or x>=n or y<0 or y>=n or a[x][y]==0:
                        continue
                    a[x][y]=0
                    Q.append((x,y))
            cnt+=1
print(cnt)