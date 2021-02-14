import sys
#sys.stdin = open("input.txt","rt")

n=int(input())
a=list(map(int,input().split()))
ave=int(sum(a)/n+0.5)
min=2147000000

for idx, x in enumerate(a):
    tmp=abs(x-ave)
    if tmp<min:
        min=tmp
        score=x
        res=idx+1
    elif tmp==min:
        if score<x:
            score=x
            res=idx+1

print(ave,res)

'''
n=int(input())
s=list(map(int,input().split()))
sum=0

for i in range(0,n):
    sum=sum+s[i]
sum=round(sum/n)
a=abs(s[0]-sum)
student=0
number=0

for i in range(0,n):
    if abs(s[i]-sum)<=a:
        if student<s[i]:
            student=s[i]
            number=i
            a = abs(s[i] - sum)
            print(a,student,number)
        else:
            a = abs(s[i] - sum)
            print(a, student, number)

print(sum, number+1)
'''