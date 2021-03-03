import sys
#sys.stdin = open("input.txt","rt")

def Count(len):
    cnt=1
    sum=0
    for x in Music:
        if sum+x<=len:
            sum+=x
        else:
            sum=x
            cnt+=1
    return cnt

n,m=map(int,input().split())
Music=list(map(int,input().split()))

lt=0
rt=sum(Music)
res=0
maxx=max(Music)
while lt<=rt:
    mid=(lt+rt)//2
    if mid>=maxx and Count(mid)<=m:
        res=mid
        rt=mid-1
    else:
        lt=mid+1
print(res)