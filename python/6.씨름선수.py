import sys
#sys.stdin = open("input.txt","rt")


n=int(input())
a=[]

for _ in range(n):
    h,w=map(int,input().split())
    a.append((h,w))
a.sort(reverse=True)
max=0
cnt=0

for x,y in a:
    if y>max:
        max=y
        cnt+=1

print(cnt)
'''
for i in range(n):
    if a[i][1]>max:
        max=a[i][1]
        cnt+=1

print(cnt)
'''