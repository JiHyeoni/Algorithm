import sys
#sys.stdin = open("input.txt", 'r')

n=int(input())
dis=[[100]*n for _ in range(n)]

while True:
    a,b=map(int,input().split())
    if a==-1 and b==-1:
        break
    dis[a-1][b-1]=1
    dis[b-1][a-1]=1
for i in range(n):
    dis[i][i]=0
for k in range(n):
    for i in range(n):
        for j in range(n):
            dis[i][j]=min(dis[i][j],dis[i][k]+dis[k][j])

res=[0]*n
score=100
for i in range(n):
    for j in range(n):
        res[i]=max(res[i],dis[i][j])
    score=min(score,res[i])
out=[]
for i in range(len(res)):
    if res[i]==score:
        out.append(i+1)
print(score, len(out))
for x in out:
    print(x,end=' ')
