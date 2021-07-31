import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1165B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> problems = new ArrayList<>();
    // int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      problems.add(sc.nextInt());
      // p[i] = sc.nextInt();
    }
    Collections.sort(problems);
    // Arrays.sort(p);
    int res = 0;
    for (int i = 0; i < n; i++) {
      // if (p[i] >= res + 1) {
      if (problems.get(i) >= res + 1) {
        res++;
      }

    }
    System.out.println(res);
  }

}
