import math
import sys
input = sys.stdin.readline


def invr():
    return list(map(int, input().split()))


n, k = invr()
a = invr()

print(len([x for x in a if x >= a[k - 1] and x != 0]))
