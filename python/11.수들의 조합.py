import sys
import itertools as it
#sys.stdin=open("input.txt", "r")

n, k = map(int, input().split())
a = list(map(int, input().split()))
m = int(input())
cnt = 0
for x in it.combinations(a,k):#조합
    if sum(x)%m==0:
        cnt+=1
print(cnt)
'''
def DFS(L,s,sum):
    global cnt
    if k==L:
        if sum%m==0:
            cnt+=1
    else:
        for x in range(s,n):
            DFS(L+1,x+1,sum+a[x])


if __name__ == '__main__':
    n,k=map(int,input().split())
    a=list(map(int,input().split()))
    m=int(input())
    cnt=0
    DFS(0,0,0)
    print(cnt)
'''