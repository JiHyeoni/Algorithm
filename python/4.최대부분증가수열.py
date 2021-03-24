import sys
#sys.stdin = open("input.txt", 'r')

n=int(input())
a=list(map(int,input().split()))
dy=[0]*n
res=0
for i in range(n):
    cnt=0
    for j in range(i-1,-1,-1):
        if a[i]>a[j] and dy[j]>cnt:
            cnt=dy[j]
        dy[i]=cnt+1
    res=max(dy[i],res)
print(res)
