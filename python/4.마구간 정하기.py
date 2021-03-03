import sys
#sys.stdin = open("input.txt","rt")

def Count(len):
    ep=a[0]
    cnt=1
    for x in range(1,n):
        if a[x]-ep>=len:
            cnt+=1
            ep=a[x]
    return cnt


n,c=map(int,input().split())
a=[]
for _ in range(n):
    a.append(int(input()))

a.sort()
lt=0
rt=max(a)
res=0
while lt<=rt:
    mid=(lt+rt)//2
    if Count(mid)>=c:
        res=mid
        lt=mid+1
    else:
        rt=mid-1
print(res)