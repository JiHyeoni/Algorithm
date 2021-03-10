import sys
#sys.stdin=open("input.txt", "r")

def DFS(L,sum):
    global res
    if L==k:
        if 0<sum<=s:
            res.add(sum)
    else:
        DFS(L+1,sum+a[L])
        DFS(L+1,sum-a[L])
        DFS(L+1,sum)


if __name__ == '__main__':
    k=int(input())
    a=list(map(int,input().split()))
    s=sum(a)
    res=set()
    DFS(0,0)
    print(s-len(res))