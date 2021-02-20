import sys
import itertools as it #순열이나 조합을 자동으로 구해줌
#sys.stdin=open("input.txt", "r")

n, f = map(int, input().split())
b=[1]*n
cnt=0
for i in range(1,n):
    b[i]=b[i-1]*(n-i)//i
a=list(range(1,n+1))
for tmp in it.permutations(a):#a에 있는 자료의 모든 순열의 경우를 구해줌
    sum=0
    for L,x in enumerate(tmp):
        sum+=(x*b[L])
    if sum==f:
        for x in tmp:
            print(x, end=' ')
        break

'''
def DFS(L,sum):
    if L==n and sum==f:
        for x in p:
            print(x,end=' ')
        sys.exit(0)
    else:
        for i in range(1,n+1):
            if ch[i]==0:
                ch[i]=1
                p[L]=i
                DFS(L+1,sum+(p[L]*b[L]))
                ch[i]=0



if __name__ == '__main__':
    n, f = map(int, input().split())
    p=[0]*n
    b=[1]*n
    ch=[0]*(n+1)
    for i in range(1,n):
        b[i]=b[i-1]*(n-i)//i
    DFS(0,0)
'''