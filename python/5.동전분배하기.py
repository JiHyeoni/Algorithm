import sys
#sys.stdin=open("input.txt", "r")

def DFS(L):
    global res
    if L==n:
        cha=max(money)-min(money)
        if res > cha:
            tmp = set()
            for x in money:
                tmp.add(x)
            if len(tmp)==3:
                res=cha
    else:
        for i in range(3):
            money[i]+=coin[L]
            DFS(L+1)
            money[i]-=coin[L]


if __name__ == '__main__':
    n=int(input())
    coin=[]
    for i in range(n):
        a=int(input())
        coin.append(a)
    res=2147000000
    money=[0]*3
    DFS(0)
    print(res)

