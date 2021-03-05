import sys
#sys.stdin = open("input.txt","rt")

s=input()
stack=[]
res=''
for x in s:
    if x.isdecimal():
        res+=x
    elif x=='(':
        stack.append(x)
    elif x=='*' or x=='/':
        while stack and (stack[-1]=='*' or stack[-1]=='/'):
            res+=stack[-1]
            stack.pop()
        stack.append(x)
    elif x=='+' or x=='-':
        while stack and stack[-1]!='(':
            res+=stack[-1]
            stack.pop()
        stack.append(x)
    elif x==')':
        while stack and stack[-1]!='(':
            res+=stack[-1]
            stack.pop()
        stack.pop()
while stack:
    res+=stack[-1]
    stack.pop()
print(res)