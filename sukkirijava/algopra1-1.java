import java.util.Scanner;

class Max4 {
  static int max4(int a, int b, int c, int d) {
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    if (d > max) {
      max = d;
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a, b, c, d;
    System.out.println("4つの値の最大値");
    System.out.println("aの値");
    a = stdIn.nextInt();
    System.out.println("bの値");
    b = stdIn.nextInt();
    System.out.println("cの値");
    c = stdIn.nextInt();
    System.out.println("dの値");
    d = stdIn.nextInt();
    int max = max4(a, b, c, d);
    System.out.println("最大値は" + max);
  }
}