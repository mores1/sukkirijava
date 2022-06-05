import java.util.Scanner;

class Main {
  // 引数numの約数を求めて配列に入れるメソッド
  public static List<Integer> divisor(int num) {

  }

  public static void main(String[] args) throws Exception {
    // 標準入力された数値の約数を出力
    Scanner scan = new Scanner(System.in);
    var n = Integer.parseInt(scan.nextLine().trim());

    System.out.println(divisor(n));
  }
}