import sys
#sys.stdin = open("input.txt","rt")
s = input()
stack=[]
cnt=0
for i in range(len(s)):
    if s[i]=='(':
        stack.append(s[i])
    else:
        stack.pop()
        if s[i-1]=='(':
            cnt+=len(stack)
        else:
            cnt+=1

print(cnt)

'''
m=list(str(input().split()))
m=m[2:-2]
stack=[]
sum=0
for i in range(len(m)):
    stack.append(m[i])
    if m[i]==')' and m[i-1]=='(':
        stack.pop()
        stack.pop()
        sum+=len(stack)
    elif m[i]==')' and m[i-1]==')':
        stack.pop()
        stack.pop()
        sum+=1
print(sum)
'''

