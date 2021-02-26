import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
a=list(map(int,input().split()))
m=int(input())
b=list(map(int,input().split()))
c=[]
p1=0
p2=0

while p1<n and p2<m:
    if a[p1]<=b[p2]:
        c.append(a[p1])
        p1+=1
    else:
        c.append(b[p2])
        p2+=1

if p1<n:
    c=c+a[p1:]
else:
    c=c+b[p2:]
for x in c:
    print(x,end=' ')