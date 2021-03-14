import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

dx=[-1,0,1,0]
dy=[0,-1,0,1]

n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
L=0
ch=[[0]*n for _ in range(n)]
sum=0
Q=deque()
Q.append((n//2,n//2))
sum+=a[n//2][n//2]
ch[n//2][n//2]=1
while True:
    if L == n // 2:
        break
    else:
        size=len(Q)
        for _ in range(size):
            tmp=Q.popleft()
            for i in range(4):
                x=tmp[0]+dx[i]
                y=tmp[1]+dy[i]
                if 0<=x<n and 0<=y<n and ch[x][y]==0:
                    ch[x][y]=1
                    sum+=a[x][y]
                    Q.append((x,y))
            #print(sum)
        L+=1
print(sum)
