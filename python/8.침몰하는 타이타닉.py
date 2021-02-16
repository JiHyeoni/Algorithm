import sys
from collections import deque
#조금 더 효율적으로 데크를 사용
#리스트는 pop할때마다 전체를 앞으로 옮겨서 비효율적이지만 데크는 양쪽에서 데이터 내보내기, 추가 가능
#sys.stdin = open("input.txt","rt")

n,limit = map(int,input().split())
p=list(map(int,input().split()))
p.sort()
p=deque(p)
cnt=0

while p:
    if len(p)==1:
        cnt+=1
        break
    if p[0]+p[-1]>limit:
        p.pop()
        cnt+=1
    else :
        p.popleft()
        p.pop()
        cnt+=1
print(cnt)
