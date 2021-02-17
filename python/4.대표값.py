import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
a=list(map(int,input().split()))
ave=int(sum(a)/n+0.5)
min=2147000000

for i in range(n):
    tmp=abs(a[i]-ave)
    if tmp<min:
        min=tmp
        score=a[i]
        res=i
    elif tmp==min:
        if score<a[i]:
            score=a[i]
            res=i
print(ave,res+1)

'''
n=int(input())
a=list(map(int,input().split()))
ave=int(sum(a)/n+0.5)
min=2147000000
for idx,x in enumerate(a):
    tmp=abs(ave-x)
    if tmp<min:
        min=tmp
        score=x
        res=idx+1
    elif tmp==min:
        if score<x:
            score=x
            res=idx+1
print(ave, res)

'''