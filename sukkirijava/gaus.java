import java.util.Scanner;

class Gaus {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int x, sum, cnt;

    System.out.println("x=何番目?");
    x = stdIn.nextInt();

    cnt = 1;
    sum = 0;

    do {
      sum += cnt * cnt * cnt * cnt;
      cnt += 1;
    } while (cnt <= x);

    System.out.println(sum);
  }
}