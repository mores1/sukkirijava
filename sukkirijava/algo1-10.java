import java.util.Scanner;

class SumVerbose1 {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("1からnまでの総和を求めます。");
    int n;
    do {
      System.out.print("nを入力してください");
      n = stdIn.nextInt();
    } while (n <= 0);
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i < n) {
        System.out.print(i + "+");
      } else {
        System.out.print(i + "=");
      }
      sum += i;
    }
    System.out.print("総和は" + sum);
  }
}