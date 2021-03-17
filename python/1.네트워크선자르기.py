import sys
#sys.stdin=open("input.txt", "r")

def DFS(len):
    if res[len]>0:
        return res[len]
    if len==1 or len==2:
        return len
    else:
        res[len]=DFS(len-1)+DFS(len-2)
        return res[len]

if __name__ == '__main__':
    n=int(input())
    res=[0]*(n+1)
    print(DFS(n))