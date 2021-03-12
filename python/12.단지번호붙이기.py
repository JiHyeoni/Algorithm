import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

dx=[1,0,-1,0]
dy=[0,-1,0,1]

n=int(input())
a=[list(map(int,input()))for _ in range(n)]
Q=deque()
res=[]
cnt=0
for i in range(n):
    for j in range(n):
        if a[i][j]==1:
            Q.append((i,j))
            cnt=1
            a[i][j]=0
            while Q:
                tmp=Q.popleft()
                for k in range(4):
                    x = tmp[0] + dx[k]
                    y = tmp[1] + dy[k]
                    if x<0 or x>=n or y<0 or y>=n or a[x][y]==0:
                        continue
                    a[x][y]=0
                    Q.append((x,y))
                    cnt+=1
            res.append(cnt)
print(len(res))
res.sort()
for x in res:
    print(x)
