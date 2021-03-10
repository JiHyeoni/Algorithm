import sys
#sys.stdin=open("input.txt", "r")

def DFS(L,s,t,x):
    global max
    if t>m:
        return
    if s>max:
        max=s
    for i in range(x,n):
        DFS(L+1,s+a[i][0],t+a[i][1],i+1)

if __name__ == '__main__':
    n,m=map(int,input().split())
    a=[]
    ch=[0]*n
    max=-2147000000
    for _ in range(n):
        s,t=map(int,input().split())
        a.append((s,t))
    DFS(0,0,0,0)
    print(max)

'''
def DFS(L,sum,time):
    global res
    if time>m:
        return
    if L==n:
        if sum>res:
            res=sum
    else:
        DFS(L+1,sum+pv[L],time+pt[L])
        DFS(L+1,sum,time)


if __name__ == '__main__':
    n, m = map(int, input().split())
    pv=list()
    pt=list()
    for i in range(n):
        a,b=map(int,input().split())
        pv.append(a)
        pt.append(b)
    res=-2147000000
    DFS(0,0,0)
    print(res)
'''