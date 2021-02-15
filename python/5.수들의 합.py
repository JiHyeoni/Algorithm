import sys
#sys.stdin = open("input.txt","rt")

n,m = map(int,input().split())
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
n,m = map(int,input().split())
a=list(map(int,input().split()))
cnt=0

for i in range(0,n):
    num = 0
    for j in range(i,n):
        if num<m:
            num+=a[j]
            print(num)
        elif num>m:
            print(num)
            break
        elif num==m:
            cnt+=1

print(cnt)
'''