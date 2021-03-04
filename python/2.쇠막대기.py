import sys
#sys.stdin = open("input.txt","rt")

s=input()
stack=[]
sum=0

for x in range(len(s)):
    if s[x]=='(':
        stack.append(s[x])
    else:
        stack.pop()
        if s[x-1]=='(':
            sum+=len(stack)
        else:
            sum+=1
print(sum)


