
import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


n = inp()

p = invr()

p.sort()

res = 0

for i in range(n):
    if p[i] >= res + 1:
        res += 1

print(res)
