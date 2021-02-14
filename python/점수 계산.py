import sys
#sys.stdin = open("input.txt","rt")

n = int(input())
a=list(map(int,input().split()))
sum=0
cnt=0

for x in a:
    if x==1:
        cnt+=1
        sum+=cnt
    else:
        cnt=0
print(sum)

'''
n = int(input())
a=list(map(int,input().split()))
score=a[0]
cnt=1
for i in range(1,n):
    if a[i]==1:
        if a[i]==a[i-1]:
            cnt+=1
        score=score+cnt


    elif a[i]==0:
        cnt=1
    #print(cnt)
print(score)
'''