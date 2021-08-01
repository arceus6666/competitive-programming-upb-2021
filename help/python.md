# Python notes

## Easy inputs

### Basic imports
```python
import math, sys
input = sys.stdin.readline
```

### For taking integer inputs
```python
def inp():
    return int(input())
```

### For taking space separated integer variable inputs
```python
def invr():
    return list(map(int, input().split()))
```

### For taking string inputs
```python
def insr():
    s = input()
    return "".join(list(s[:len(s) - 1]))
```

### For taking space separated string variable inputs
```python
def inlt():
    return list(map(str, input().split()))
```

## Code samples

### number with all distinct digits
```python
def diff(n):
    ar = [0] * 10
    while n > 0:
        digit = math.floor(n % 10)
        if (ar[digit]):
            return 0
        ar[digit] = 1
        n = int(n / 10)
    return 1
```

### check if subarray B is in array A
```python
# n = len(A); m = len(B)
def isSubArray(A, B, n, m):

    # Two pointers to traverse the arrays
    i = 0
    j = 0

    # Traverse both arrays simultaneously
    while (i < n and j < m):

        # If element matches
        # increment both pointers
        if (A[i] == B[j]):

            i += 1
            j += 1

            # If array B is completely
            # traversed
            if (j == m):
                return i - m

        # If not,
        # increment i and reset j
        else:
            i = i - j + 1
            j = 0

    return -1
```

### int to char
```python
# chr(97) -> 'a'
def itoc(c):
  return chr(c)
```

### char to int
```python
# ord('a') -> 97
def ctoi(i):
  return ord(i)
```
