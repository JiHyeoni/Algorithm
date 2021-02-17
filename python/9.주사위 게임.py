import sys
#sys.stdin=open("input.txt", "r")

max=0
res=0
n=int(input())

for i in range(n):
    tmp=input().split()
    tmp.sort()
    a, b, c=map(int, tmp)
    if a==b and b==c:
        money=10000+(a*1000);
    elif a==b or a==c:
        money=1000+(a*100)
    elif b==c:
        money=1000+(b*100)
    else:
        money=c*100
    if money > res:
        res=money

print(res)

'''
n=int(input())
max=0
for _ in range(n):
    money = 0
    a=list(map(int,input().split()))
    a.sort()
    if a[0]==a[1] and a[0]==a[2] and a[1]==a[2]:
       money=10000+a[0]*1000
    elif a[0]==a[1] and a[1]!=a[2]:
        money = 1000 + a[0] * 100
    elif a[0]!=a[1] and a[1]==a[2]:
        money = 1000 + a[1] * 100
    elif a[0]==a[2] and a[1]!=a[2]:
        money = 1000 + a[0] * 100
    else:
        money=a[2]*100
    if money>max:
        max=money

print(max)
'''