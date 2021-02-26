import sys
#sys.stdin=open("input.txt", "r")

def Count(len):
    cnt=1
    ep=xl[0]
    for i in range(1,n):
        if xl[i]-ep>=len:
            cnt+=1
            ep=xl[i]
    return cnt

n,c=map(int,input().split())
xl=[]
for _ in range(n):
    xl.append(int(input()))
xl.sort()
lt=1
rt=xl[n-1]

while lt<=rt:
    mid=(lt+rt)//2
    if Count(mid)>=c:
        res=mid
        lt=mid+1
    else:
        rt=mid-1
print(res)
