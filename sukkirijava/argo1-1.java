import java.util.Scanner;

class Max3 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("3つの整数の最大値を求めます。");
    System.out.println("aの値");
    int a = stdIn.nextInt();
    System.out.println("bの値");
    int b = stdIn.nextInt();
    System.out.println("cの値");
    int c = stdIn.nextInt();
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    System.out.println("最大値は" + max + "です！");
  }
}