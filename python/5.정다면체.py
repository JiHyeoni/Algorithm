import sys
#sys.stdin=open("input.txt", "r")

n,m=map(int,input().split())
a=[0]*(n+m+3)
for i in range(1,n+1):
    for j in range(1,m+1):
        a[i+j-1]+=1
max=0
for x in range(1,n+m+1):
    if max<a[x]:
        max=a[x]
for x in range(1,n+m+1):
    if a[x]==max:
        print(x+1, end=' ')

'''
n,m=map(int,input().split())
cnt=[0]*(n+m+3)
max=0
for i in range(1,n+1):
    for j in range(1,m+1):
        cnt[i+j]+=1

for i in range(n+m+1):
    if cnt[i]>max:
        max=cnt[i]

for i in range(n+m+1):
    if cnt[i]==max:
        print(i,end=' ')
'''