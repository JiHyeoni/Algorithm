import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

dx=[0,1,0,-1]
dy=[1,0,-1,0]
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
ch=[[0]*n for _ in range(n)]
L=0
Q=deque()
sum=a[n//2][n//2]
ch[n//2][n//2]=1
Q.append((n//2,n//2))
while True:
    if L==n//2:
        break
    else:
        size=len(Q)
        for _ in range(size):
            tmp=Q.popleft()
            for k in range(4):
                x=tmp[0]+dx[k]
                y=tmp[1]+dy[k]
                if 0<=x<n and 0<=y<n and ch[x][y]==0:
                    ch[x][y]=1
                    Q.append((x,y))
                    sum+=a[x][y]
        L+=1
print(sum)