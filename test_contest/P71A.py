
import math
import sys
input = sys.stdin.readline


def inp():
    return int(input())


def insr():
    s = input()
    return "".join(list(s[:len(s) - 1]))


n = inp()

for i in range(n):
    word = insr()
    l = len(word)
    if l > 10:
        print(word[0], l - 2, word[l - 1], sep="")
    else:
        print(word)
