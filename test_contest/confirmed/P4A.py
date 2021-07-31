import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


w = inp()

if w - 2 > 1 and (w - 2) % 2 == 0:
    print('YES')
else:
    print('NO')
