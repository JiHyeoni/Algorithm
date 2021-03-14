import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

dx=[-1,0,1,0]
dy=[0,-1,0,1]

def DFS(x,y):
    #print(x,y)
    global cnt
    if x==6 and y==6:
        cnt+=1
    else:
        for i in range(4):
            xx=x+dx[i]
            yy=y+dy[i]
            if 0<=xx<7 and 0<=yy<7 and a[xx][yy]==0 and ch[xx][yy]==0:
                ch[xx][yy]=1
                DFS(xx,yy)
                ch[xx][yy]=0

if __name__ == '__main__':
    cnt=0
    a=[list(map(int,input().split())) for _ in range(7)]
    ch=[[0]*7 for _ in range(7)]
    ch[0][0]=1
    DFS(0,0)
    print(cnt)