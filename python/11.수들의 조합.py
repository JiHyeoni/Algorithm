import sys
import itertools as it
#sys.stdin=open("input.txt", "r")

def DFS(L,sum,s):
    global cnt
    if L==k :
        if sum%m==0:
            cnt+=1
    else:
        for i in range(s,n):
            DFS(L+1,sum+a[i],i+1)
if __name__ == '__main__':
    n, k = map(int, input().split())
    a = list(map(int, input().split()))
    m = int(input())
    cnt=0
    DFS(0,0,0)
    print(cnt)

'''
n,k=map(int,input().split())
a=list(map(int,input().split()))
m=int(input())
cnt=0
for x in it.combinations(a,k):
    if sum(x)%m==0:
        cnt+=1
print(cnt)
'''