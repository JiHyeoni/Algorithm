import sys
#sys.stdin=open("input.txt", "r")

n,m=map(int,input().split())
n=list(map(int,str(n)))
stack=[]
for x in n:
    while stack and stack[-1]<x and m>0:
        stack.pop()
        m-=1
    stack.append(x)
if m!=0:
    stack=stack[:-m]
for x in stack:
    print(x,end='')