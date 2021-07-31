import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4A {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int w = Integer.parseInt(br.readLine());

    if ((w - 2 > 1) && ((w - 2) % 2 == 0)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
