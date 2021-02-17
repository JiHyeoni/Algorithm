import sys
#sys.stdin=open("input.txt", "r")

if __name__ == '__main__':
    n,k=map(int,input().split())
    a=[]
    for i in range(1,n+1):
        if n%i==0:
            a.append(i)
    if len(a)<k:
        print(-1)
    else:
        print(a[k-1])

'''
n,k=map(int,input().split())
a=[]
cnt=0
for i in range(1,n+1):
    if n%i==0:
        a.append(i)
        cnt+=1

if cnt<k:
    print("-1")
else:
    print(a[k-1])
'''