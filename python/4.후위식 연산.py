import sys
#sys.stdin = open("input.txt","rt")
a=input()
stack=[]
res=0

for x in a:
    if x.isdecimal():
        stack.append(int(x))
    else:
        if x=='+':
            res=stack[-2]+stack[-1]
            stack.pop()
            stack.pop()
            stack.append(res)
        elif x=='-':
            res=stack[-2]-stack[-1]
            stack.pop()
            stack.pop()
            stack.append(res)
        elif x=='*':
            res=stack[-2]*stack[-1]
            stack.pop()
            stack.pop()
            stack.append(res)
        elif x=='/':
            res=stack[-2]/stack[-1]
            stack.pop()
            stack.pop()
            stack.append(res)
print(stack[0])