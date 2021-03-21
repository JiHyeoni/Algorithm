import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
a=list(map(int,input().split()))
dy=[0]*n
dy[0]=1
max=0

for i in range(1,n):
    res=0
    for j in range(i-1,-1,-1):
        if a[i]>a[j] and res<dy[j]:
            res=dy[j]
    dy[i]=res+1
    if max<dy[i]:
        max=dy[i]
print(max)
