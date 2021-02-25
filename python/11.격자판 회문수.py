import sys
#sys.stdin=open("input.txt", "r")

a=[list(map(int,input().split())) for _ in range(7)]
cnt=0
for i in range(7):
    for j in range(2,5):
        if a[i][j-2]==a[i][j+2] and a[i][j-1]==a[i][j+1]:
            cnt+=1
        if a[j-2][i]==a[j+2][i] and a[j-1][i]==a[j+1][i]:
            cnt+=1
print(cnt)
'''
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