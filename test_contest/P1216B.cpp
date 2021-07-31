#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int max(int a[], int size)
{
  int m = a[0];
  for (int i = 1; i < size; i++)
  {
    if (a[i] > m)
      m = a[i];
  }
  return m;
}

int main()
{
  int n;
  cin >> n;

  int a[n];

  for (int i = 0; i < n; i++)
  {
    cin >> a[i];
  }

  int cn = max(a, n) + 1;

  int b[n] = {};
  int c[cn] = {};
  int ii[n] = {};

  for (int e : a)
  {
    c[e]++;
  }

  for (int i = 0; i < cn; i++)
  {
    c[i] += c[i - 1];
  }

  for (int e = n - 1, i = n; e > -1; e--, i--)
  {
    b[c[e] - 1] = e;
    ii[c[e] - 1] = i;
    c[e]--;
  }

  int cc = 0;
  for (int i = n - 1, x = 0; i > -1; i--, x++)
  {
    int e = b[i];
    cc += 1 + (e * x);
  }

  cout << cc << endl;

  for (int i = n - 1; i > -1; i++)
  {
    cout << ii[i];
    if (i > 0)
      cout << " ";
  }

  return 0;
}
