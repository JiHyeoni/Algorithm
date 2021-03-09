import sys
sys.stdin=open("input.txt", "r")

def DFS(v):
    if v>7:
        return
    else:
        print(v,end=' ')
        DFS(2*v)
        DFS(2*v+1)

def DFS2(v):
    if v>7:
        return
    else:
        DFS2(2*v)
        print(v, end=' ')
        DFS2(2*v+1)

def DFS3(v):
    if v>7:
        return
    else:
        DFS3(2*v)
        DFS3(2*v+1)
        print(v, end=' ')


if __name__ == '__main__':
    DFS(1)
    print()
    DFS2(1)
    print()
    DFS3(1)