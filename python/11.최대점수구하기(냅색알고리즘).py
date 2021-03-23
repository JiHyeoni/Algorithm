import sys
#sys.stdin = open("input.txt", 'r')

if __name__ == '__main__':
    n,m=map(int,input().split())
    dy=[0]*(m+1)
    for _ in range(n):
        s,t=map(int,input().split())
        for j in range(m,t-1,-1):
            dy[j]=max(dy[j],dy[j-t]+s)
print(dy[m])