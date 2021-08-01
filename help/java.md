# Java Notes

## Facts

- Arrays/Collections' `sort` is fast enough.
- `math.pow()` is fast enough.
- Use `sc.hasNext();` for EOF.
- `math.max(a, b);` and `a > b ? a : b;` are basically the same.

## Theory

### Combinations (Binomial coefficient)
C(n, k) // N choose K
$$  
\binom{n}{k} = \frac {n!}{k!(n-k)!}
$$

## Time Complexity

| Big O<br>Notation | Name        | Examples                                                                             |
| ----------------- | ----------- | ------------------------------------------------------------------------------------ |
| O(1)              | Constant    | <li>Odd or Even number <li>Look-up table (on average)                                |
| O(log n)          | Logarithmic | <li>Finding element on sorted array with binary search                               |
| O(n)              | Linear      | <li>Find max element in unsorted array <li>Duplicates elements in array with hashmap |
| O(n^2)            | Quadratic   | <li>Duplicate elements in array (naive)  <li>Sorting array with bubble sort          |
| O(n^3)            | Cubic       | <li>3 variables equation solver                                                      |
| O(2^n)            | Exponential | <li>Find all subsets                                                                 |
| O(n!)             | Factorial   | <li>Find all permutations of a given set/string                                      |

## Numbers (Java)

|              | width  | minimum                    | maximum                            |
| ------------ | ------ | -------------------------- | ---------------------------------- |
| **SIGNED**   |
| byte:        | 8 bit  | -128                       | +127 (10^2)                        |
| short:       | 16 bit | -32 768                    | +32 767 (10^4)                     |
| int:         | 32 bit | -2 147 483 648             | +2 147 483 647 (10^9)              |
| long:        | 64 bit | -9 223 372 036 854 775 808 | +9 223 372 036 854 775 807 (10^18) |
| **UNSIGNED** |
| char         | 16 bit | 0                          | +65 535                            |

## Bitwise Operations

A = 0011 1100 = 60 B = 0000 1101 = 13

**& and**  
A & B = 0000 1100 = 12

**| or**  
A | B = 0011 1101 = 61

**^ xor**  
A ^ B = 0011 0001 = 49

**~ complement**  
~A = 1100 0011 = -61

**<< left shift**  
A << 2 = 1111 0000 = 240 

**\>\> right shift**  
A >> 2 = 1111 = 15 

**\>\>\> zero fill rigth shift**  
A >>> 2 = 0000 1111 = 15

## Bit hacks

1. Check if the integer is even or odd. `(x & 1) == 0 ? even : odd`
2. Test if the n-th bit is set. `x & (1<<n) ? n-th bit is set : n-th bit is not set`
3. Set the n-th bit. `x | (1<<n)`
4. Unset the n-th bit. `x & ~(1<<n)`
5. Toggle the n-th bit. `x ^ (1<<n)`
6. Turn off the rightmost 1-bit. `x & (x-1)`
7. Isolate the rightmost 1-bit. `x & (-x)`
8. Right propagate the rightmost 1-bit. `x | (x-1)`
9. Isolate the rightmost 0-bit. `~x & (x+1)`
10. Turn on the rightmost 0-bit. `x | (x+1)`

## Strings

### Lexicographically compare strings

`s1.compareTo(s2);` 
- s1 > s2 -> + 
- s1 = s2 -> 0 
- s1 < s2 -> -

## Arrays

TBD

## Big Integer

`b1.compareTo(b2);`
- b1 > b2 -> +
- b1 = b2 -> 0
- b1 < b2 -> -

## Code Samples

### Recursive factorial

```java
static long factorialRecursive(long n) {
  return n == 1 ? 1 : n * factorialRecursive(n - 1);
}
```

### Reverse a string
```java
// @param {s} string to revert
// @return reverted string
static String reverse(String s) {
  return new StringBuilder(s).reverse().toString();
}
```

### Factorial < 20
```java
// import java.util.stream.LongStream;
static long factorialStreams(long n) {
  return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
}
```

### Factorial > 20
```java
// import java.math.BigInteger;
static BigInteger getFactorial(int num) {
  BigInteger result = BigInteger.ONE;
  for (int i = 1; i <= num; i++)
    result = result.multiply(BigInteger.valueOf(i));
  return result;
}
```

### Iterative permutations
```java
// @param {s} string to permute
// @return array with the permutations
static String[] permutationIterative(String s) {
  List<String> perms = new ArrayList<>();
  perms.add(s.charAt(0) + "");
  for (int i = 1; i < s.length(); i++) {
    for (int j = perms.size() - 1; j >= 0; j--) {
      String str = perms.remove(j);
      for (int k = 0; k <= str.length(); k++) {
        perms.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
      }
    }
  }
  return perms.toArray(new String[perms.size()]);
}
```

### Recursive permutations
```java
static String[] permutationRecursive(String candidate, String remaining, ArrayList<String> memo, int size) {
  if (remaining.length() == 0) {
    memo.add(candidate);
  }
  for (int i = 0; i < remaining.length(); i++) {
    String newCandidate = candidate + remaining.charAt(i);
    String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
    permutationRecursive(newCandidate, newRemaining, memo, size);
  }
  return memo.toArray(new String[size]);
}
```

### Permutations
```java
// @param str string to calculate permutation for
// @param l starting index
// @param r end index
static void permute(String str, int l, int r) {
  if (l == r)
    System.out.println(str);
  else {
    for (int i = l; i <= r; i++) {
      str = swap(str, l, i);
      permute(str, l + 1, r);
      str = swap(str, l, i);
    }
  }
}

// Swap Characters at position
// @param {a} string value
// @param {i} position 1
// @param {j} position 2
// @return swapped string
static String swap(String a, int i, int j) {
  char temp;
  char[] c = a.toCharArray();
  temp = c[i];
  c[i] = c[j];
  c[j] = temp;
  return new String(c);
}
```

### Sort strings
```java
// @param {str} string to sort
// @return sorted string
// import java.util.Arrays;
static String sort(String str) {
  char[] tmp = str.toCharArray();
  Arrays.sort(tmp);
  return new String(tmp);
}

// @param {str} string to sort
// @return sorted string
static String sortStream(String str) {
  return str.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();
}
```

### char to int
```java
// @param {c} char to convert
static int charToInt(char c) {
  return c - '0';
}
```

### Remove blank spaces from string
```java
// @param {s} string to fix
static String trim(String s) {
  return s.replaceAll("\\s+", "");
}
```

### Split string in n chars
```java
// @param {s} string to split
// @param {n} size to split
// @return string splited
static String[] splitByN(String s, int n) {
  return s.split(("(?<=\\G.{" + n + "})"));
}
```

### Reverse a string
```java
// @param {s} string to revert
// @return reverted string
static String reverse(String s) {
  return new StringBuilder(s).reverse().toString();
}
```

### Binary search
```java
static int binarySearch(int[] A, int T) {
  int n = A.length;
  int L = 0;
  int R = n - 1;
  while (L <= R) {
    int m = (L + R) / 2;
    if (A[m] < T) {
      L = m + 1;
    } else if (A[m] > T) {
      R = m - 1;
    } else {
      return m;
    }
  }
  return -1;
}
```
