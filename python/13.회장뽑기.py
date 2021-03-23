import sys
#sys.stdin = open("input.txt", 'r')

if __name__ == '__main__':
    n=int(input())
    dis=[[100]*n for _ in range(n)]
    for i in range(n):
        dis[i][i]=0
    while True:
        a,b=map(int,input().split())
        if a==-1 and b==-1:
            break
        else:
            dis[a-1][b-1]=1
            dis[b-1][a-1]=1
    for k in range(n):
        for i in range(n):
            for j in range(n):
                dis[i][j]=min(dis[i][j],dis[i][k]+dis[k][j])
    res=[0]*n
    min_s=2147000000
    for i in range(n):
        for j in range(n):
            res[i]=max(res[i],dis[i][j])
        min_s=min(res[i],min_s)
    out=[]
    for i in range(len(res)):
        if res[i]==min_s:
            out.append(i+1)
    print("%d %d" %(min_s,len(out)))
    for x in out:
        print(x,end=' ')


