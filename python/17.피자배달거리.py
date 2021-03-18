import sys
#sys.stdin=open("input.txt", "r")

def DFS(L,s):
    global res
    if L==m:
        sum=0
        for i in range(len(hs)):
            dis = 2147000000
            x1=hs[i][0]
            y1=hs[i][1]
            for x in cb:
                x2=pz[x][0]
                y2=pz[x][1]
                dis=min(abs(x1-x2)+abs(y1-y2),dis)
            sum+=dis
        if sum<res:
            res=sum


    else:
        for i in range(s,len(pz)):
            cb[L]=i
            DFS(L+1,i+1)

if __name__ == '__main__':
    n,m=map(int,input().split())
    a=[list(map(int,input().split())) for _ in range(n)]
    hs=[]
    pz=[]
    cb=[0]*m
    res=2147000000
    for i in range(n):
        for j in range(n):
            if a[i][j]==1:
                hs.append((i,j))
            if a[i][j]==2:
                pz.append((i,j))
    DFS(0,0)
    print(res)