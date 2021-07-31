#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{

  int n, c = 0;
  cin >> n;
  while (n > 0)
  {
    int d = n % 10;
    if (d == 4)
    {
      if (c <= 1)
      {
        c++;
      }
      else
      {
        cout << "NO";
        exit(0);
      }
    }
    else if (d == 1)
    {
      c = 0;
    }
    else
    {
      cout << "NO";
      exit(0);
    }

    n /= 10;
  }
  cout << (c == 0 ? "YES" : "NO");
  return 0;
}
