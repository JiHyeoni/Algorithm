import sys
#sys.stdin=open("input.txt", "r")
def DFS(L,P):
    global cnt
    if L==n:
        cnt+=1
        for x in range(P):
            print(chr(res[x]+64),end='')
        print()
    else:
        for i in range(27):
            if 0<i<10 and a[L]==i:
                res[P]=i
                DFS(L+1,P+1)
            elif 10<=i and a[L]==i//10 and a[L+1]==i%10:
                res[P]=i
                DFS(L+2,P+1)
if __name__ == '__main__':
    a=list(map(int,input()))
    n=len(a)
    a.insert(n,-1)
    res=[0]*(n+3)
    cnt=0
    DFS(0,0)
    print(cnt)