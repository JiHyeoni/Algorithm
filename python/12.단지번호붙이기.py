import sys
from collections import  deque
#sys.stdin=open("input.txt", "r")


dx=[-1,0,1,0]
dy=[0,-1,0,1]
n = int(input())
a = [list(map(int, input())) for _ in range(n)]
Q=deque()
res=[]
for i in range(n):
    for j in range(n):
        if a[i][j] == 1:
            cnt=1
            Q.append((i,j))
            a[i][j]=0
            while Q:
                tmp=Q.popleft()
                for k in range(4):
                    x=tmp[0]+dx[k]
                    y=tmp[1]+dy[k]
                    if 0<=x<n and 0<=y<n and a[x][y]==1:
                        a[x][y]=0
                        Q.append((x,y))
                        cnt+=1
            res.append(cnt)
print(len(res))
res.sort()
for x in res:
    print(x)

'''
dx=[-1,0,1,0]
dy=[0,-1,0,1]
def DFS(x,y):
    global cnt
    cnt += 1
    a[x][y]=0
    for k in range(4):
        xx=x+dx[k]
        yy=y+dy[k]
        if 0<=xx<n and 0<=yy<n and a[xx][yy]==1:
            DFS(xx,yy)


if __name__ == '__main__':
    n=int(input())
    a=[list(map(int,input()))for _ in range(n)]
    res=[]
    for i in range(n):
        for j in range(n):
            if a[i][j]==1:
                cnt=0
                DFS(i,j)
                res.append(cnt)
    res.sort()
    print(len(res))
    for x in res:
        print(x)
'''