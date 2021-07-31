
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n, k;
  cin >> n >> k;
  int a[n];
  for (int i = 0; i < n; i++)
  {
    cin >> a[i];
  }

  int c = 0;
  for (int i = 0; i < n; i++)
  {
    int x = a[i];
    if (x >= a[k - 1] && x != 0)
      c++;
  }
  cout << c;
  return 0;
}
