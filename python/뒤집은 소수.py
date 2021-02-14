import sys
#sys.stdin = open("input.txt","rt")

n = int(input())
a=list(map(int,input().split()))

def reverse(x):
    res=0
    while x>0:
        t=x%10
        res=res*10+t
        x=x//10
    return res

def isPrime(x):
    if x==1:
        return False
    for i in range(2,x//2+1):
        if x%i==0:
            return False
    else:
        return True

for x in a:
    tmp = reverse(x)
    if isPrime(tmp):
        print(tmp, end=' ')

'''

def reverse(x):
    num=0
    while x>0:
        num*=10
        num+=x%10
        x=x//10
    return(num)

for x in a:
    tmp=reverse(x)
    
def isPrime(x):
    ch=[0]*(x+1)
    cnt=0
    for i in range(2,x+1):
        if ch[i]==0:
            return ch[i].

            for j in range(i,x+1,i):
                ch[j]=1

print(isPrime(7))
'''