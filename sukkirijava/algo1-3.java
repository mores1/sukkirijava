import java.util.Scanner;

class JudgeSign {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("整数を入力");
    int n = stdIn.nextInt();
    if (n > 0) {
      System.out.println("＋");
    } else if (n == 0) {
      System.out.println("ゼロ");
    } else {
      System.out.println("マイナス");
    }
  }
}