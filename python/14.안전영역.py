import sys
from collections import deque
import copy
#sys.stdin=open("input.txt", "r")
sys.setrecursionlimit(10**6)

dx=[-1, 0, 1, 0]
dy=[0, 1, 0, -1]
def DFS(x,y,h):
    ch[x][y]=1
    for k in range(4):
        xx=x+dx[k]
        yy=y+dy[k]
        if 0<=xx<n and 0<=yy<n and a[xx][yy]>h and ch[xx][yy]==0:
            DFS(xx,yy,h)


if __name__ == '__main__':
    n=int(input())
    a=[list(map(int,input().split())) for _ in range(n)]
    res=0
    for h in range(100):
        ch=[[0]*n for _ in range(n)]
        cnt=0
        for i in range(n):
            for j in range(n):
                if a[i][j]>h and ch[i][j]==0:
                    cnt+=1
                    DFS(i,j,h)
        res=max(res,cnt)
        if cnt==0:
            break
    print(res)


'''
dx=[0,1,0,-1]
dy=[-1,0,1,0]
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
ch=copy.deepcopy(a)
max=-2147000000
min=2147000000
for i in a:
    for j in range(n):
        if i[j]>max:
            max=i[j]
        if i[j]<min:
            min=i[j]
cnt=0
Q=deque()
m=0
while min<=max:
    cnt=0
    for i in range(n):
        for j in range(n):
            if a[i][j]>min:
                Q.append((i,j))
                a[i][j]=0
                while Q:
                    tmp=Q.popleft()
                    for k in range(4):
                        x=tmp[0]+dx[k]
                        y=tmp[1]+dy[k]
                        if 0<=x<n and 0<=y<n and a[x][y]>min:
                            Q.append((x,y))
                            a[x][y]=0
                cnt+=1
    if cnt>m:
        m=cnt
    a=copy.deepcopy(ch)
    min+=1
print(m)
'''