import sys
#sys.stdin = open("input.txt","rt")

s=input()
stack=[]
cnt=0
for x in range(len(s)):
    if s[x]=='(':
        stack.append(s[x])
    else:
        stack.pop()
        if s[x-1]=='(':
            cnt+=len(stack)
        elif s[x-1]==')':
            cnt+=1
print(cnt)