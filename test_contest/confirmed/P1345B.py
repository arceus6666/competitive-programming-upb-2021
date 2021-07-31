import math, sys
input = sys.stdin.readline

def inp():
    return int(input())

t = inp()

while t > 0:
    n = inp()
    c = 0
    while n > 1:
        x = 2
        while x <= n:
            n -= x
            x += 3
        c += 1
    print(c)
    t-=1
