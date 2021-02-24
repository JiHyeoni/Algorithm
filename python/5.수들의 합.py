import sys
#sys.stdin=open("input.txt", "r")
n,m=map(int,input().split())
a=list(map(int,input().split()))
lt=0
rt=1
tot=a[0]
cnt=0
while True:
    if tot<m:
        if rt<n:
            tot+=a[rt]
            rt+=1
        else:
            break
    elif tot==m:
        cnt+=1
        tot-=a[lt]
        lt+=1
    else:
        tot-=a[lt]
        lt+=1
print(cnt)
'''
n,m=map(int,input().split())
a=list(map(int,input().split()))
cnt=0
for i in range(len(a)+1):
    for j in range(i,len(a)+1):
        if sum(a[i:j])<m:
            continue
        elif sum(a[i:j])==m:
            cnt+=1
            break
        elif sum(a[i:j])>m:
            break
print(cnt)
'''