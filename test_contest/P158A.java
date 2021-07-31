import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P158A {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = br.read();
    int k = br.read();

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = br.read();
    }

    int c = 0;

    for (int i = 0; i < n; i++) {
      int x = a[i];
      if (x >= a[k - 1] && x != 0)
        c++;
    }
    System.out.println(c);
  }
}
