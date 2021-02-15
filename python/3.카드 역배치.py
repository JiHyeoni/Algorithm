import sys
#sys.stdin = open("input.txt","rt")
a=list(range(21))
for _ in range(10):
    s,e= map(int,input().split())
    for i in range((e-s+1)//2):
        a[s+i],a[e-i]=a[e-i],a[s+i]
a.pop(0)
for x in a:
    print(x, end=' ')


'''
num=list(range(1,21))
for i in range(10):
    a,b= map(int,input().split())
    a=a-1
    b=b-1
    while a<b:
        tmp=num[b]
        num[b]=num[a]
        num[a]=tmp
        a+=1
        b-=1
for i in num:
    print(i, end=' ')
'''