import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

public class P1216B {

  public static int max(int[] a, int size) {
    int m = a[0];
    for (int i = 1; i < size; i++) {
      if (a[i] > m)
        m = a[i];
    }
    return m;
  }

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = br.read();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = br.read();
    }

    int cn = max(a, n);

    int[] b = new int[n];
    int[] c = new int[cn];
    int[] ii = new int[n];

    for (int e : a) {
      c[e]++;
    }

    for (int i = 0; i < cn; i++) {
      c[i] += c[i - 1];
    }

    for (int e = n - 1, i = n; e > -1; e--, i--) {
      b[c[e] - 1] = e;
      ii[c[e] - 1] = i;
      c[e]--;
    }

    int cc = 0;
    for (int i = n - 1, x = 0; i > -1; i--, x++) {
      int e = b[i];
      cc += 1 + (e * x);
    }

    System.out.println(cc);

    for (int i = n - 1; i > -1; i++) {
      System.out.print(ii[i]);
      if (i > 0)
        System.out.print(" ");
    }
  }
}
