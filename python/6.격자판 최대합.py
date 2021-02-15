import sys
#sys.stdin = open("input.txt","rt")
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
largest=-2147000000
for i in range(n):
    sum1=sum2=0
    for j in range(n):
        sum1+=a[i][j]
        sum2+=a[j][i]
    if sum1>largest:
        largest=sum1
    if sum2>largest:
        largest=sum2
sum1=sum2=0
for i in range(n):
    sum1+=a[i][i]
    sum2+=a[i][n-i-1]
if sum1>largest:
    largest=sum1
if sum2>largest:
    largest=sum2


print(largest)

'''
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
max=0
num=0
for i in range(0,n):
    num=0
    for j in range(0,n):
        num+=a[i][j]
    if max<num:
        max=num
    #print(num, max)

for i in range(0,n):
    num=0
    for j in range(0,n):
        num+=a[j][i]
    if max<num:
        max=num
    #print(num, max)

num=0

for i in range(0,n):
    num+=a[i][i]
    if max<num:
        max=num
    #print(num, max)

num=0
for i in range(0,n):
    num+=a[i][n-1-i]
    if max<num:
        max=num
print(max)
'''