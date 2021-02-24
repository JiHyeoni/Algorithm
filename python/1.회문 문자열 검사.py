import sys
#sys.stdin=open("input.txt", "r")

n=int(input())
for x in range(n):
    str=input()
    str=str.upper()
    for i in range(len(str)//2):
        if str[i]==str[len(str)-i-1]:
            continue
        else:
            print("#%d NO" % (x + 1))
            break
    else:
        print("#%d YES" %(x+1))

'''
n=int(input())

for i in range(n):
    s=input()
    s=s.upper()
    size=len(s)
    for j in range(size//2):
        if s[j]!= s[-1-j]:
            print("#%d NO" %(i+1))
            break
    else:
         print("#%d YES" %(i+1))
'''
'''
if s==s[::-1]:
    print("#%d YES" %(i+1))
else:
    print("#%d NO" %(i+1))
'''