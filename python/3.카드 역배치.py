import sys
#sys.stdin=open("input.txt", "r")

a=list(range(1,21))
for _ in range(10):
    s,e=map(int,input().split())
    for i in range((e-s)//2+1):
        a[s-1+i],a[e-1-i]=a[e-1-i],a[s-1+i]
for x in a:
    print(x,end=' ')