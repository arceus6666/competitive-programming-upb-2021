#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string mult(string s, int n)
{
  string ss = s;
  for (int i = 1; i < n; i++)
  {
    ss += s;
  }
  return ss;
}

string LCM(string s, string t)
{
  int i = 1, j = 1;
  string ms = s;
  string mt = t;

  while (ms.length() != mt.length())
  {
    if (ms == mt)
      return ms;

    if (ms.length() < mt.length())
    {
      ms = mult(s, i);
      i++;
    }
    else
    {
      mt = mult(t, j);
      j++;
    }
  }

  if (ms == mt)
    return ms;

  return "-1";
}

int main()
{
  int n;
  cin >> n;
  while (n--)
  {
    string s, t;
    cin >> s >> t;

    cout << LCM(s, t);
  }
  return 0;
}
