import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def insr():
    s = input()
    return "".join(list(s[:len(s) - 1]))


def mult(s, n):
    i = 1
    ss = s
    while(i < n):
        ss += s
        i += 1
    return ss


def LCM(s, t):
    i = 1
    j = 1
    ms = s
    mt = t
    while len(ms) != len(mt):
        if(ms == mt):
            return ms

        if(len(ms) < len(mt)):
            ms = mult(s, i)
            i += 1
        else:
            mt = mult(t, j)
            j += 1

    if(ms == mt):
        return ms
    return "-1"


n = inp()


while(n > 0):
    n -= 1
    s = insr()
    t = insr()
    print(LCM(s, t))
