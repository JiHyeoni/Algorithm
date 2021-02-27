import sys
#sys.stdin=open("input.txt", "r")

def Count(len):
    cnt=0
    for x in Line:
        cnt+=x//len
    return cnt

k,n=map(int,input().split())
Line=[]
for _ in range(k):
    Line.append(int(input()))
lt=0
rt=max(Line)
res=0
while lt<=rt:
    mid=(lt+rt)//2
    if Count(mid)>=n:
        res=mid
        lt=mid+1
    else:
        rt=mid-1
print(res)