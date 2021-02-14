import sys
#sys.stdin = open("input.txt","rt")

n, m = map(int,input().split())

cnt=[0]*(n+m+3)
max=0

for i in range(n+1):
    for j in range(m+1):
        cnt[i+j]+=1

for i in range(n+m+1):
    if cnt[i]>max:
        max=cnt[i]

for i in range(n+m+1):
    if cnt[i]==max:
        print(i+1, end=' ')
