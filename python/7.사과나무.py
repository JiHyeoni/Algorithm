import sys
#sys.stdin = open("input.txt","rt")
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
res=0
s=e=n//2

for i in range(n):
    for j in range(s,e+1):
        res+=a[i][j]
    if i<n//2:
        s-=1
        e+=1
    else:
        s+=1
        e-=1

print(res)

'''
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
lp=n//2
rp=n//2
num=0

for i in range(0,n//2+1):
    for j in range(lp,rp+1):
        num+=a[i][j]
    lp-=1
    rp+=1
    if lp<0:
        break

lp=1
rp=n-2
for i in range(n//2+1,n):

    for j in range(lp,rp+1):
        num+=a[i][j]
    lp += 1
    rp -= 1
    if lp>rp:
        break
print(num)
'''