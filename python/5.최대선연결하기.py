import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
a=list(map(int,input().split()))

dy=[0]*(n)
dy[0]=1
res=0
for i in range(1,n):
    max=0
    for j in range(i-1,-1,-1):
        if a[j]<a[i] and dy[j]>max:
            max=dy[j]
    dy[i]=max+1
    if res<dy[i]:
        res=dy[i]
print(res)