import java.util.Scanner;

class MaxOfArray {
  static int maxOf(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++)
      if (a[i] > max)
        max = a[i];
    return max;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("身長の最大値を求めます。");
    System.out.print("人数を入力して下さい。");
    int num = stdIn.nextInt();

    int[] height = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print("身長を入力せよ height[" + i + "]:");
      height[i] = stdIn.nextInt();
    }
    System.out.println("最大値は" + maxOf(height) + " です。");
  }
}