import sys
#sys.stdin=open("input.txt", "r")

dx=[1,0,-1,0]
dy=[0,1,0,-1]
def DFS(x,y):
    global cnt
    if x==ex and y==ey:
        cnt+=1
    else:
        for i in range(4):
            xx=x+dx[i]
            yy=y+dy[i]
            if 0<=xx<n and 0<=yy<n and ch[xx][yy]==0 and board[xx][yy]>board[x][y]:
                ch[xx][yy]=1
                DFS(xx,yy)
                ch[xx][yy]=0
if __name__ == '__main__':
    n=int(input())
    board=[[0]*n for _ in range(n)]
    max=-2147000000
    min=2147000000
    ch=[[0]*n for _ in range(n)]
    for i in range(n):
        tmp=list(map(int,input().split()))
        for j in range(n):
            if min>tmp[j]:
                min=tmp[j]
                sx=i
                sy=j
            if max<tmp[j]:
                max=tmp[j]
                ex=i
                ey=j
            board[i][j]=tmp[j]
    ch[sx][sy]=1
    cnt = 0
    DFS(sx,sy)
    print(cnt)

