import sys
#sys.stdin=open("input.txt", "r")
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
sum=0
b=n//2
c=n//2

for i in range((n//2)+1):
    for j in range(b,c+1):
        sum+=a[i][j]
    b-=1
    c+=1
b += 2
c -= 2
for i in range((n//2)+1,n):
    for j in range(b,c+1):
        sum+=a[i][j]
    b += 1
    c -= 1
print(sum)

'''
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