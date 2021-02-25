import sys
#sys.stdin=open("input.txt", "r")
n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
max=-2147000000

for i in range(n):
    sum1=0
    sum2=0
    for j in range(n):
        sum1+=a[i][j]
        sum2+=a[j][i]
    if sum1>max:
        max=sum1
    if sum2>max:
        max=sum2
sum1=0
sum2=0
for i in range(n):
    sum1+=a[i][i]
    sum2+=a[i][n-1-i]

if max<sum1:
    max=sum1
if max<sum2:
    max=sum2

print(max)
'''
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