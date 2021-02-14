import sys
#sys.stdin = open("input.txt","rt")

n = int(input())
a=list(map(int,input().split()))

def digit_sum(x):
    sum=0
    for i in str(x):
        sum+=int(i)
    return sum
    '''
    while x>0:
        sum+=x%10
        x=x//10
    return sum
    '''

max=-247000000
for i in range(0,n):
    if max<digit_sum(a[i]):
        max=digit_sum(a[i])
        res=a[i]

print(res)