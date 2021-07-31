#include <iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  for (int i = 0; i < n; i++)
  {
    string word;
    cin >> word;
    int l = word.length();
    if (l > 10)
    {
      cout << word[0] << l - 2 << word[l - 1] << endl;
    }
    else
    {
      cout << word << endl;
    }
  }
}
