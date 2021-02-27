import sys
#sys.stdin=open("input.txt", "r")

n,m=map(int,input().split())
a=list(map(int,input().split()))
a.sort()
lt=0
rt=n-1
while lt<=rt:
    mid=(lt+rt)//2
    if a[mid]>m:
        rt=mid-1
    elif a[mid]<m:
        lt=mid+1
    else:
        break
print(mid+1)



'''
n,m=map(int,input().split())
a=list(map(int,input().split()))
a.sort()
for x in range(n):
    if a[x]==m:
        print(x+1)
'''