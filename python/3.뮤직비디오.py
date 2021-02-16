import sys
#jbsys.stdin = open("input.txt","rt")

def Count(capacity):
    cnt=1
    sum=0
    for x in a:
        if sum+x>capacity:
            cnt+=1
            sum=x
        else:
            sum+=x
    return cnt


n,m=map(int,input().split())
a=list(map(int,input().split()))
maxx=max(a)
largest=sum(a)
lt=1
rt=largest
res=0
while lt<=rt:
    mid=(lt+rt)//2
    if mid>=maxx and Count(mid)<=m:
        res=mid
        rt = mid - 1
    else:
        lt=mid+1

print(res)