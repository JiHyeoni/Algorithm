import sys
#sys.stdin = open("input.txt","rt")

n=int(input())
a=list(map(int,input().split()))

lt=0
rt=n-1
res=''
tmp=[]
last=0

while lt<=rt:
    if a[lt]>last:
        tmp.append((a[lt],'L'))
    if a[rt]>last:
        tmp.append((a[rt],'R'))
    tmp.sort()
    if len(tmp)==0:
        break
    else:
        last=tmp[0][0]
        res=res+tmp[0][1]
        if tmp[0][1]=='L':
            lt+=1
        else:
            rt-=1
        tmp.clear()
print(len(res))
print(res)