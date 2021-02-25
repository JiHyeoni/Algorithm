import sys
#sys.stdin=open("input.txt", "r")

a=[list(map(int,input().split())) for _ in range(9)]
p1=0
p2=0
p3=0

for i in range(9):
    b=[0]*10
    c=[0]*10
    for j in range(9):
        if b[a[i][j]] == 0:
            b[a[i][j]] = 1
        elif b[a[i][j]] == 1:
            p1 = 1
            break
        if c[a[j][i]] == 0:
            c[a[j][i]] = 1
        elif c[a[j][i]] == 1:
            p2 = 1
            break
for i in range(0,9,3):
    for j in range(0,9,3):
        d=[0]*10
        for k in range(3):
            for s in range(3):
                if d[a[k+i][s+j]] == 0:
                    d[a[k+i][s+j]] = 1
                elif d[a[k+i][s+j]] == 1:
                    p3 = 1
                    break
if p1 ==0 and p2==0 and p3==0:
    print("YES")
else:
    print("NO")
'''
def check(a):
    for i in range(9):
        ch1=[0]*10
        ch2=[0]*10
        for j in range(9):
            ch1[a[i][j]]=1
            ch2[a[j][i]] = 1
        if sum(ch1)!=9 or sum(ch2)!=9:
            return False
    for i in range(3):
        for j in range(3):
            ch3=[0]*10
            for k in range(3):
                for s in range(3):
                    ch3[a[i*3+k][j*3+s]]=1
            if sum(ch3)!=9:
                return  False
    return True

a=[list(map(int,input().split())) for _ in range(9)]
if check(a):
    print("YES")
else:
    print("NO")

'''