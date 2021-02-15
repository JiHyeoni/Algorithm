import sys
#sys.stdin = open("input.txt","rt")

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
s=input()
num=0
cnt=0
for x in s:
    if x=='0' or x=='1' or x=='2' or x=='3' or x=='4' or x=='5' or x=='6' or x=='7' or x=='8' or x=='9':
        num=int(x)+num*10

for i in range(1,num+1):
    if num%i==0:
        cnt+=1
print(num)
print(cnt)
'''