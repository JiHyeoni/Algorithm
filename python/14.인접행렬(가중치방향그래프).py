import sys
sys.stdin=open("input.txt", "r")

n,m=map(int,input().split())
a=[[0]*n for _ in range(n)]
for _ in range(m):
    s,e,n=map(int,input().split())
    a[s-1][e-1]=n
    
for i in range(n+1):
    for j in range(n+1):
        print(a[i][j],end=' ')
    print()