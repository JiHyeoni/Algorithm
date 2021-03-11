import sys
#sys.stdin=open("input.txt", "r")

def DFS(L,sum):
    if L==k:
        if 0<sum:
            a.add(sum)
    else:
        DFS(L + 1, sum)
        DFS(L+1,sum+w[L])
        DFS(L+1,sum-w[L])


if __name__ == '__main__':
    k=int(input())
    w=list(map(int,input().split()))
    n=sum(w)
    a=set()
    DFS(0,0)
    print(n-len(a))
