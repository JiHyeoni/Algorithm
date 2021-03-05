import sys
import heapq as hq
#sys.stdin = open("input.txt","rt")
a=[]

while True:
    n=int(input())
    if n == -1 :
        break
    if n==0:
        if len(a)!=0:
            print(-hq.heappop(a))
        else:
            print(-1)
    else:
        hq.heappush(a,-n)