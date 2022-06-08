import java.util.Scanner;

class Gyaku {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    double sum = 0;
    int n;
    System.out.println("数を入力");
    n = stdIn.nextInt();
    int cnt = 0;
    while (sum <= n) {
      cnt++;
      sum += (1.0 / cnt);
    }
    System.out.println(cnt);
    System.out.println(sum);
  }
}