import sys
#sys.stdin=open("input.txt", "r")

def DFS(L,sum):
    global cnt
    if sum>t:
        return
    if L==k:
        if sum==t:
            cnt+=1

    else:
        for j in range(n[L]+1):
            DFS(L+1,sum+p[L]*j)

if __name__ == '__main__':
    t=int(input())
    k=int(input())
    p=[]
    n=[]
    cnt=0
    for _ in range(k):
        a,b=map(int,input().split())
        p.append(a)
        n.append(b)
    a=sum(n)
    DFS(0,0)
    print(cnt)