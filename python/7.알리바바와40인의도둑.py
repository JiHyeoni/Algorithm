import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
dy=[[0]*n for _ in range(n)]
dy[0][0]=a[0][0]

for i in range(1,n):
    dy[0][i]=dy[0][i-1]+a[0][i]
    dy[i][0]=dy[i-1][0]+a[i][0]

for i in range(1,n):
    for j in range(1,n):
        if dy[i-1][j]>dy[i][j-1]:
            dy[i][j]=dy[i][j-1]+a[i][j]
        else:
            dy[i][j] = dy[i-1][j] + a[i][j]
print(dy[n-1][n-1])
'''
def DFS(x,y):
    if dy[x][y]>0:
        return dy[x][y]
    if x==0 and y==0:
        return a[0][0]
    else:
        if x==0:
            dy[x][y]=DFS(x,y-1)+a[x][y]
        elif y==0:
            dy[x][y]=DFS(x-1,y)+a[x][y]
        else:
            dy[x][y]=min(DFS(x-1,y),DFS(x,y-1))+a[x][y]
        return dy[x][y]

if __name__ == '__main__':
    n=int(input())
    a=[list(map(int,input().split())) for _ in range(n)]
    dy=[[0]*n for _ in range(n)]
    print(DFS(n-1,n-1))
'''