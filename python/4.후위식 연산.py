import sys
#sys.stdin = open("input.txt","rt")

a=input()
stack=[]
for x in a:
    if x.isdecimal():
        stack.append(int(x))
    else:
        if x=='+':
            n1=stack.pop()
            n2=stack.pop()
            stack.append(n2+n1)
        elif x=='-':
            n1=stack.pop()
            n2=stack.pop()
            stack.append(n2-n1)
        elif x == '*':
            n1 = stack.pop()
            n2 = stack.pop()
            stack.append(n2 * n1)
        elif x == '/':
            n1 = stack.pop()
            n2 = stack.pop()
            stack.append(n2/n1)
print(stack[0])

'''
for x in a:
    if x.isdecimal():
        stack.append(x)
    elif x=='+':
        if stack:
            num=int(stack[-2])+int(stack[-1])
            stack.pop()
            stack.pop()
            stack.append(num)
    elif x=='-':
        if stack:
            num=int(stack[-2])-int(stack[-1])
            stack.pop()
            stack.pop()
            stack.append(num)
    elif x=='*':
        if stack:
            num=int(stack[-2])*int(stack[-1])
            stack.pop()
            stack.pop()
            stack.append(num)
    elif x=='/':
        if stack:
            num=int(stack[-2])/int(stack[-1])
            stack.pop()
            stack.pop()
            stack.append(num)
print(stack[0])
'''