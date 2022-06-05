import java.util.Scanner;

class test {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int sum = 0;
    System.out.print("調べたい数：");
    int a = stdIn.nextInt();

    for (int i = 1; i <= 1000000; i++) {
      if (a % i == 0) {
        sum++;
        System.out.println(i);
      }
    }
    System.out.println("約数の総数は" + sum + "個です");
  }
}