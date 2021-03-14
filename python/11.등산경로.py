import sys
#sys.stdin=open("input.txt", "r")

dx=[-1,0,1,0]
dy=[0,-1,0,1]

def DFS(x,y):
    global cnt
    if x==s2 and y==e2:
        cnt+=1
    else:
        for i in range(4):
            xx=x+dx[i]
            yy=y+dy[i]
            if 0<=xx<n and 0<=yy<n and ch[xx][yy]==0 and a[xx][yy]>a[x][y]:
                ch[xx][yy]=1
                DFS(xx,yy)
                ch[xx][yy]=0
if __name__ == '__main__':
    n=int(input())
    min=2147000000
    max=-2147000000
    s1=0
    e1=0
    s2=0
    e2=0
    a=[[0]*n for _ in range(n)]
    for i in range(n):
        tmp=list(map(int,input().split()))
        for j in range(n):
            if tmp[j]>max:
                max=tmp[j]
                s2=i
                e2=j
            if tmp[j]<min:
                min=tmp[j]
                s1=i
                e1=j
            a[i][j]=tmp[j]
    cnt=0
    ch=[[0]*n for _ in range(n)]
    ch[s1][e1]=1
    DFS(s1,e1)
    print(cnt)
