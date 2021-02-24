import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
a=list(map(int,input().split()))
m=int(input())
b=list(map(int,input().split()))
c=[]
n1=0
n2=0
while n1<n and n2<m:
    if a[n1]<=b[n2]:
        c.append(a[n1])
        n1+=1
    else:
        c.append(b[n2])
        n2+=1
if n1<n:
    c=c+a[n1:]
elif n2<m:
    c=c+b[n2:]
for x in c:
    print(x,end=' ')
'''
n=int(input())
a=list(map(int,input().split()))
m=int(input())
b=list(map(int,input().split()))
p1=p2=0
c=[]

while p1<n and p2<m:
    if a[p1]<=b[p2]:
        c.append(a[p1])
        p1+=1
    else:
        c.append(b[p2])
        p2+=1

if p1<n:
    c=c+a[p1:]
if p2<m:
    c=c+b[p2:]

for x in c :
    print(x, end= ' ')
'''