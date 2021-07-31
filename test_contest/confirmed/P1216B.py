import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def invr():
    return list(map(int, input().split()))


n = inp()

a = invr()
b = [0] * len(a)
c = [0] * (max(a) + 1)
ii = [0] * len(a)
# aa = list(reversed(sorted(a[:])))
# aa.sort()
# aa.reverse()

for e in a:
    c[e] += 1
for i in range(1, len(c)):
    # print(i)
    c[i] += (c[i - 1])

i = len(a)
for e in a[::-1]:
    # print(i)
    b[c[e] - 1] = e
    ii[c[e] - 1] = str(i)
    c[e] -= 1
    i -= 1

ii.reverse()
b.reverse()

x = 0
cc = 0
for e in b:
    cc += 1 + (e*x)
    x += 1

print(cc)
print(" ".join(ii))
