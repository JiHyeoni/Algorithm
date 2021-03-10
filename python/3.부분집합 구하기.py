import sys
#sys.stdin=open("input.txt", "r")

def DFS(L):
    if L==n:
        for i in range(n):
            if ch[i]==1:
                print(i+1,end=' ')
        print()
    else:
        ch[L]=1
        DFS(L+1)
        ch[L]=0
        DFS(L+1)

if __name__ == '__main__':
    n=int(input())
    ch=[0]*n
    DFS(0)