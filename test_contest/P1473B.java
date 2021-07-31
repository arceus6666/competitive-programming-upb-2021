import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1473B {

  static String mult(String s, int n) {
    String ss = s;
    for (int i = 1; i < n; i++) {
      ss += s;
    }
    return ss;
  }

  static String lcm(String s, String t) {
    int i = 1, j = 1;
    String ms = s, mt = t;

    while (ms.length() != mt.length()) {
      if (ms == mt)
        return ms;
      if (ms.length() < mt.length()) {
        ms = mult(s, i);
        i++;
      } else {
        mt = mult(t, j);
        j++;
      }
    }

    if (ms == mt)
      return ms;
    return "-1";
  }

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = br.read();
    while (n-- > 0) {
      String s = br.readLine(), t = br.readLine();
      System.out.println(lcm(s, t));
    }
  }
}
