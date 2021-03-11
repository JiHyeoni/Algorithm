import sys
#sys.stdin=open("input.txt", "r")

def DFS(v):
    global cnt
    if v==n-1:
        cnt+=1
    else:
        for i in range(n):
            if a[v][i]==1 and ch[i]==0:
                ch[i]=1
                DFS(i)
                ch[i]=0


n,m=map(int,input().split())
a=[[0]*n for _ in range(n)]
for _ in range(m):
    s,e=map(int,input().split())
    a[s-1][e-1]=1
ch=[0]*n
ch[0]=1
cnt=0
DFS(0)
print(cnt)
