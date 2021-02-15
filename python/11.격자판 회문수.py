import sys
#sys.stdin = open("input.txt","rt")

a = [list(map(int,input().split())) for _ in range(7)]
cnt=0
for i in range(3):
    for j in range(7):
        tmp=a[j][i:i+5]
        if tmp == tmp[::-1]:#역순
            cnt+=1
        for k in range(2):
            if a[i+k][j]!=a[i+5-k-1][j]:
                break
        else:
            cnt+=1

print(cnt)

'''
a = [list(map(int,input().split())) for _ in range(7)]
cnt=0
for i in range(7):
    for j in range(3):
        if a[i][j]==a[i][j+4]:
            if a[i][j+1]==a[i][j+3]:
                cnt+=1
        if a[j][i]==a[j+4][i]:
            if a[j+1][i]==a[j+3][i]:
                cnt+=1
print(cnt)
'''


