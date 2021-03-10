import sys
#sys.stdin=open("input.txt", "r")
def DFS(L,sum,tsum):
    global max
    if sum+(total-tsum)<max:
        return
    if sum>c:
        return
    if L==n:
        if sum>max:
            max=sum
    else:
        DFS(L+1,sum+w[L],tsum+w[L])
        DFS(L+1,sum,tsum+w[L])

if __name__ == '__main__':
    c,n=map(int,input().split())
    w=[]
    max=-2147000000
    for _ in range(n):
        w.append(int(input()))
    total=sum(w)
    DFS(0,0,0)
    print(max)