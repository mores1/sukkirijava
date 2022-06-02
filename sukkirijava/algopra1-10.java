// import java.util.Scanner;

// class Cnt {
//   public static void main(String[] args) {
//     Scanner stdIn = new Scanner(System.in);
//     int n;
//     do {
//       System.out.println("正の整数を入力して下さい。");
//       n = stdIn.nextInt();
//     } while (n <= 0);
//     String moji = String.valueOf();
//     int cnt = moji.length(cnt);
//     System.out.println(n + "桁です。");
//   }
// }

import java.util.Scanner;

class DigitsNo {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("正の整数値の桁数を求めます。");

    int n;
    do {
      System.out.print("整数値：");
      n = stdIn.nextInt();
    } while (n <= 0);

    int no = 0; // 桁数
    while (n > 0) {
      n /= 10; // nを10で割る
      no++;
    }

    System.out.println("その数は" + no + "桁です。");
  }
}
