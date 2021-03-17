import sys
from collections import deque
sys.setrecursionlimit(10**6)
#sys.stdin=open("input.txt", "r")

dx=[1,0,-1,0]
dy=[0,-1,0,1]

def DFS(x,y,h):
    ch[x][y] = 1
    for k in range(4):
        xx=x+dx[k]
        yy=y+dy[k]
        if 0<=xx<n and 0<=yy<n and a[xx][yy]>h and ch[xx][yy]==0:
            ch[xx][yy]=1
            DFS(xx,yy,h)


if __name__ == '__main__':
    n=int(input())
    a=[list(map(int,input().split())) for _ in range(n)]
    max=-2147000000
    for h in range(100):
        ch=[[0]*n for _ in range(n)]
        cnt=0
        for i in range(n):
            for j in range(n):
                if a[i][j]>h and ch[i][j]==0:
                    DFS(i,j,h)
                    cnt+=1
        if max<cnt:
            max=cnt
        if cnt==0:
            break
print(max)