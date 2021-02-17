import sys
import heapq as hq
#sys.stdin = open("input.txt","rt")
a=[]
while True:
    n=int(input())
    if n==-1:
        break
    if n==0:
        if len(a)==0:
            print(-1)
        else:
            print(hq.heappop(a)) # a에서 루트노드를 pop하고 리턴
    else:
        hq.heappush(a,n) # a리스트에 n값을 push


