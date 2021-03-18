import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
a=list(map(int,input().split()))
a.insert(0,0)
max=-2147000000
dy=[0]*(n+1)
dy[1]=1
for i in range(2,n+1):
    res=0
    for j in range(i-1,0,-1):
        if a[j]<a[i] and dy[j]>res:
            res=dy[j]
    dy[i]=res+1
    if dy[i]>max:
        max=dy[i]
print(max)

