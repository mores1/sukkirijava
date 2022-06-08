import java.util.Scanner;

class Tri {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a, b, c, d;
    int n;
    int x;

    System.out.println("1番目");
    a = stdIn.nextInt();
    System.out.println("2番目");
    b = stdIn.nextInt();
    System.out.println("3番目");
    c = stdIn.nextInt();
    System.out.println("x=何番目?");
    x = stdIn.nextInt();

    n = 0;

    do {
      d = a + b + c;
      a = b;
      b = c;
      c = d;

      n += 1;
    } while (n < (x - 3));

    System.out.println(x + "番目=" + c);
  }
}