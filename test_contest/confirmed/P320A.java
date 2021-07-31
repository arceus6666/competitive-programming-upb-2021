import java.util.Scanner;

public class P320A {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = 0;
    while (n > 0) {
      int d = n % 10;
      if (d == 4) {
        if (c == 0) {
          c++;
        } else if (c == 1) {
          c++;
        } else {
          System.out.println("NO");
          System.exit(0);
        }
      } else if (d == 1) {
        // if (c == 1) {
        // c++;
        // } else if (c == 2) {
        // c++;
        // } else {
        c = 0;
        // }
      } else {
        System.out.println("NO");
        System.exit(0);
      }

      n /= 10;
    }
    System.out.println(c == 0 ? "YES" : "NO");

  }
}
