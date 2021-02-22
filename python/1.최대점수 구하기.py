import sys
#sys.stdin=open("input.txt", "r")

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
def DFS(L,sum,time):
    global max
    if time>m:
        return 
    if L==n:
        if max<sum:
            max=sum
    else:
        for x in range(n):
            if ch[x]==0:
                ch[x]=1
                if time+b[x]<=m:
                    DFS(L+1,sum+a[x],time+b[x])
                else:
                    DFS(L + 1, sum, time)
                ch[x]=0


if __name__ == '__main__':
    n,m=map(int,input().split())
    max=0
    a=[]
    b=[]
    ch=[0]*n
    for i in range(n):
        c,d=map(int,input().split())
        a.append(c)
        b.append(d)
    DFS(0,0,0)
    print(max)
'''