import java.util.Scanner;

class SumWhile {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("1～入力値までの総和を求めます");
    System.out.println("値を入力");
    int n = stdIn.nextInt();

    int sum = 0;
    int i = 1;
    while (i <= n) {
      sum += i;
      i++;
    }
    System.out.println("1～" + n + "までの総和は" + sum + "です。");
  }
}