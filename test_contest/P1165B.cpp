#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n;
  cin >> n;
  int p[n];

  for (int i = 0; i < n; i++)
  {
    cin >> p[i];
  }

  sort(p, p + n);

  int res = 0;

  for (int i = 0; i < n; i++)
  {
    if (p[0] >= res + 1)
      res++;
  }

  cout << res;
  return 0;
}
