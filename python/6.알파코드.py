import sys
#sys.stdin=open("input.txt", "r")

def DFS(L,P):
    global cnt
    if L==num:
        cnt+=1
        for j in range(P):
            print(chr(res[j]+64),end='')
        print()
    else:
        for i in range(1,27):
            if n[L]==i:
                res[P]=i
                DFS(L+1,P+1)
            elif i>=10 and n[L]==i//10 and n[L+1]==i%10:
                res[P]=i
                DFS(L+2,P+1)
if __name__ == '__main__':
    n=list(map(int,input()))
    num=len(n)
    n.append(-1)
    res=[0]*(num+3)
    cnt=0
    DFS(0,0)
    print(cnt)
