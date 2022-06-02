import java.util.Scanner;

class Gaus {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("値を入力せよ");
    int n = stdIn.nextInt();
    int gausum = (1 + n) * (n / 2);

    System.out.println("ガウスによると1～" + n + "の総和は" + gausum);
  }
}

// import java.util.Scanner;

// class SumGauss {

// public static void main(String[] args) {
// Scanner stdIn = new Scanner(System.in);

// System.out.println("1からnまでの和を求めます。");
// System.out.print("nの値：");
// int n = stdIn.nextInt();

// int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 和

// System.out.println("1から" + n + "までの和は" + sum + "です。");
// }
// }