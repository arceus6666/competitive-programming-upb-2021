#include <iostream>
#include <bits/stdc++.h>
using namespace std;

char f(char x, int fs[])
{
  return (char)(fs[(x - '0') - 1] + '0');
}

int main()
{
  int n;
  string s;
  cin >> n;
  cin >> s;

  char num[n];

  strcpy(num, s.c_str());

  int fs[9];

  for (int i = 0; i < 9; i++)
  {
    cin >> fs[i];
  }

  int i = 0;

  while (i < n && num[i] >= f(num[i], fs))
  {
    i++;
  }

  while (i < n && num[i] <= f(num[i], fs))
  {
    num[i] = f(num[i], fs);
    i++;
  }

  string r = num;

  cout << r;

  return 0;
}
