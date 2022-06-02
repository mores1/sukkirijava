import java.util.Scanner;

class SumFor {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("1～入力値までの総和を求めます");
    System.out.println("値を入力");
    int n = stdIn.nextInt();

    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("1～" + n + "までの総和は" + sum + "です。");
  }
}