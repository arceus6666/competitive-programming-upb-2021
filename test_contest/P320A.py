import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


n = inp()
c = 0

while n > 0:
    d = n % 10
    if d == 4:
        if c <= 1:
            c += 1
        else:
            print("NO")
            exit(0)
    elif d == 1:
        c = 0
    else:
        print("NO")
        exit(0)
    
    n /= 10

print("YES" if c == 0 else "NO")
