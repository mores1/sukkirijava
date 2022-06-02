import java.util.Scanner;

class Minas {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a;
    int b;
    do {
      System.out.println("aの値を入力");
      a = stdIn.nextInt();
      System.out.println("bの値を入力");
      b = stdIn.nextInt();
    } while (b < a);
    int minas = b - a;
    System.out.println(b + "-" + a + "=" + minas);
  }
}

// import java.util.Scanner;

// class Difference {

// public static void main(String[] args) {
// Scanner stdIn = new Scanner(System.in);

// System.out.print("aの値：");
// int a = stdIn.nextInt();

// int b;
// while (true) {
// System.out.print("bの値：");
// b = stdIn.nextInt();
// if (b > a)
// break;
// System.out.println("aより大きな値を入力せよ！");
// }

// System.out.println("b - aは" + (b - a) + "です。");
// }
// }