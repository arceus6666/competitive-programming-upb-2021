import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P71A {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String word = br.readLine();
      int l = word.length();
      if (l > 10)
        System.out.println(word.charAt(0) + (l - 2) + word.charAt(l - 1));
      else
        System.out.println(word);
    }
  }
}
