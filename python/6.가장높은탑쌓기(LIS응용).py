import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
arr=[]
for _ in range(n):
    a,b,c=map(int,input().split())
    arr.append((a,b,c))
arr.sort(reverse=True)
dy=[0]*n
dy[0]=arr[0][1]
max_h=arr[0][1]

for i in range(1,n):
    res=0
    for j in range(i-1,-1,-1):
        if arr[i][2]<arr[j][2] and dy[j]>res:
            res=dy[j]
    dy[i]=res+arr[i][1]
    max_h=max(max_h,dy[i])
print(max_h)