import sys
#sys.stdin=open("input.txt", "r")

def DFS(L,sum):
    global max
    if L==n+1:
        if sum>max:
            max=sum
    else:
        if L+t[L]<=n+1:
            DFS(L+t[L],sum+p[L])
        DFS(L+1,sum)

if __name__ == '__main__':
    n=int(input())
    t=list()
    p=list()
    max=-2147000000
    for _ in range(n):
        a,b=map(int,input().split())
        t.append(a)
        p.append(b)
    t.insert(0,0)
    p.insert(0,0)
    DFS(1,0)
    print(max)