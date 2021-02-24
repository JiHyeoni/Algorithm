import sys
#sys.stdin=open("input.txt", "r")

str=input()
a=0
for x in str:
    if x.isdigit():
        a=a*10+int(x)
print(a)
cnt=0
for i in range(1,a+1):
    if a%i==0:
        cnt+=1
print(cnt)
'''
s=input()
res=0

for x in s :
    if x.isdecimal(): #숫자 확인
        res=res*10+int(x)

print(res)

cnt= 0
for i in range(1,res+1):
    if res%i==0:
        cnt+=1
print(cnt)
'''