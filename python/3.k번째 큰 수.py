import sys
#sys.stdin=open("input.txt", "r")

n,k=map(int,input().split())
a=list(map(int,input().split()))
sum=set()
for i in range(n):
    for j in range(i+1,n):
        for m in range(j+1,n):
            sum.add(a[i]+a[j]+a[m])
sum=list(sum)
sum.sort(reverse=True)
print(sum[k-1])
'''
n,k=map(int,input().split())
a=list(map(int,input().split()))
res=set() #중복 제거
for i in range(n):
    for j in range(i+1,n):
        for m in range(j+1,n):
            res.add(a[i]+a[j]+a[m])
res=list(res)
res.sort(reverse=True) #오름차순
print(res[k-1])
'''