import java.util.Scanner;

public class P1157B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    char[] num = sc.nextLine().toCharArray();
    int[] fs = new int[9];
    for (int i = 0; i < 9; i++) {
      fs[i] = sc.nextInt();
    }
    int i = 0;
    while (i < n && num[i] >= f(num[i], fs)) {  
      i++;
    }
    while (i < n && num[i] <= f(num[i], fs)) {
      num[i] = f(num[i], fs);
      i++;
    }
    System.out.println(new StringBuilder().append(num));
  }

  static char f(char x, int[] fs) {
    return (char) (fs[(x - '0') - 1] + '0');
  }

}
