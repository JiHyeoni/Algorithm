import sys
from collections import deque
dx=[1,0,-1,0]
dy=[0,-1,0,1]
#sys.stdin=open("input.txt", "r")
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
L=0
sum=0
ch=[[0]*n for _ in range(n)]
p=deque()
p.append((n//2,n//2))
ch[n//2][n//2]=1
sum+=a[n//2][n//2]
while True:
    if L==n//2:
        break
    else:
        size = len(p)
        for i in range(size):
            tmp = p.popleft()
            for j in range(4):
                x=tmp[0]+dx[j]
                y=tmp[1]+dy[j]
                if ch[x][y]==0:
                    sum+=a[x][y]
                    p.append((x,y))
                    ch[x][y]=1
        L+=1
print(sum)
