import sys
#sys.stdin=open("input.txt", "r")

def DFS(L,sum):
    if sum>(total//2):
        return
    if L==n:
        if sum==(total-sum):
            print("YES")
            sys.exit(0)
    else:
        DFS(L+1,sum+a[L])
        DFS(L+1,sum)

if __name__ == '__main__':
    n=int(input())
    a=list(map(int,input().split()))
    total=sum(a)
    DFS(0,0)
    print("NO")


'''
def DFS(x):
    sum1=0
    sum2=0
    if x==n+1:
        for i in range(1,n+1):
            if ch[i]==1:
                sum1+=a[i-1]
            elif ch[i]==0:
                sum2+=a[i-1]
        if sum1==sum2:
            print("YES")
            sys.exit()
    else:
        ch[x]=1
        DFS(x+1)
        ch[x]=0
        DFS(x+1)


if __name__ == '__main__':
    n=int(input())
    a=list(map(int,input().split()))
    ch=[0]*(n+1)
    DFS(1)
    print("NO")
'''
