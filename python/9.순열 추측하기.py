import sys
import itertools as it
#sys.stdin=open("input.txt", "r")

n, f = map(int, input().split())
b = [1] * n
for i in range(1, n):
    b[i] = b[i - 1] * (n - i) // i
a=list(range(1,n+1))

for x in it.permutations(a):
    sum=0
    for i in range(n):
        sum=sum+(x[i]*b[i])
    if sum==f:
        for i in x:
            print(i,end =' ')
        break


'''
def DFS(L,sum):
    if L==n:
        if sum==f:
            for x in p:
                print(x,end=' ')
            print()
            sys.exit(0)
    else:
        for i in range(1,n+1):
            if ch[i]==0:
                ch[i]=1
                p[L]=i
                DFS(L+1,sum+(b[L]*p[L]))
                ch[i]=0

if __name__ == '__main__':
    n,f=map(int,input().split())
    p=[0]*n
    b=[1]*n
    ch=[0]*(n+1)
    for i in range(1,n):
        b[i]=b[i-1]*(n-i)//i
    DFS(0,0)
'''