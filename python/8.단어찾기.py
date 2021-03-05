import sys
#sys.stdin = open("input.txt","rt")

n=int(input())
p=dict()

for _ in range(n):
    word=input()
    p[word]=1
for _ in range(n-1):
    word=input()
    p[word]=0

for key,value in p.items():
    if value==1:
        print(key)

'''
import sys
from collections import deque
#sys.stdin=open("input.txt", "r")

n=int(input())
a=[]
b=[]
for _ in range(n):
    a.append(input())
a.sort()
a=deque(a)
for _ in range(n-1):
    b.append(input())
b.sort()
b=deque(b)
for i in range(n):
    if a[0]==b[0]:
        a.popleft()
        b.popleft()
    elif a[0]!=b[0]:
        break
print(a[0])
'''