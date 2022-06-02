import java.util.Scanner;

class SumFor2 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n;
    System.out.println("1～nまでの総和");
    do {
      System.out.println("nを入力して");
      n = stdIn.nextInt();
    } while (n <= 0);
    int sum = 0;

    for (int i = 1; i <= n; i++)
      sum += i;
    System.out.println("1から" + n + "までの総和" + sum + "です");
  }
}