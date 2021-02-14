import sys
#sys.stdin = open("input.txt","rt")

n=int(input())
money=0
max=0
for n in range(n):
    tmp = input().split()
    tmp.sort()
    a,b,c=map(int,tmp)

    for i in range(3):
        if a==b and b==c:
            money=10000+a*1000
        elif a==b or a==c:
            money=100*a+1000
        elif b==c:
            money = 100 * b + 1000
        else:
            money=c*100
        if money>max:
            max=money

print(max)
