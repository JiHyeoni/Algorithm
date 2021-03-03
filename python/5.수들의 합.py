import sys
#sys.stdin = open("input.txt","rt")
n,m=map(int,input().split())
a=list(map(int,input().split()))
lt=0
rt=0
sum=0
cnt=0
while True:
    if sum<m:
        if rt<n:
            sum += a[rt]
            rt += 1
        else:
            break
    elif sum>m:
        sum-=a[lt]
        lt+=1
    else:
        sum-=a[lt]
        lt+=1
        cnt+=1
print(cnt)