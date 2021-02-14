import sys
#sys.stdin = open("input.txt","rt")
a,b = map(int,input().split())
cnt=0

for x in range(1,a+1):
    if a%x==0:
        cnt+=1
    if cnt==b:
        print(x)
        break
else:
    print(-1)
