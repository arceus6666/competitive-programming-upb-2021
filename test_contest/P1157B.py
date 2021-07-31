import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


def f(x, fs):
    return chr(fs[(x-'0') - 1] + '0')


n = inp()

s = input()
num = list(s[:len(s)-1])

fs = invr()

i = 0

while i < n and num[i] >= f(num[i], fs):
    i += 1

while i < n and num[i] <= f(num[i], fs):
    num[i] = f(num[i], fs)
    i += 1

print("".join(map(str, num)))
