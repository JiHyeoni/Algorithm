import sys
#sys.stdin = open("input.txt","rt")

n=int(input())
a=[]
for _ in range(n):
    s,e=map(int,input().split())
    a.append((s,e))
a.sort(key=lambda x:(x[1],x[0]))
cnt=0
et=0
for s,e in a:
    if et<=s:
        cnt+=1
        et=e
print(cnt)