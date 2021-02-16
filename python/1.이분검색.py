import sys
#sys.stdin = open("input.txt","rt")

n,m=map(int,input().split())
a=list(map(int,input().split()))
a.sort()
lt=0
rt=n-1

while lt<=rt:
    mid = (lt + rt) // 2
    if a[mid]==m:
        print(mid+1)
        break
    elif a[mid] > m:
        rt = mid - 1
    else:
        lt = mid + 1
'''
n,m=map(int,input().split())
a=list(map(int,input().split()))
a.sort()
lt=0
rt=n-1
mid=(lt+rt)//2

while lt!=rt:
    if a[mid]>m:
        rt=mid-1
    if a[mid]<m:
        lt=mid+1
    mid = (lt + rt) // 2

print(mid+1)
'''


