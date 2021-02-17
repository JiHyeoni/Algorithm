import sys
#sys.stdin = open("input.txt","rt")
'''
def digit_sum(x):
    sum = 0
    for i in str(x):
        sum+=int(i)
    return sum
'''
def digit_sum(x):
    sum = 0
    while x>0:
        sum+=x%10
        x=x//10
    return sum

n=int(input())
a=list(map(int,input().split()))
max=-2147000000
for x in a:
    tot=digit_sum(x)
    if tot>max:
        max=tot
        res=x
print(res)

'''
def digit_sum(x):
    sum=0
    num=x
    while num!=0:
        sum+=num%10
        num=num//10
    return sum

n=int(input())
a=list(map(int,input().split()))
sum=0
max=0

for x in a:
    if digit_sum(x)>sum:
        sum=digit_sum(x)
        max=x
print(max)
'''