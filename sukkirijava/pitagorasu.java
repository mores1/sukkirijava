public class test5 {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    double a;
    double b;
    double c;
    int cnt = 0;
    for (int i = 1; i < 100; i = i + 2) {
      for (int j = 2; j < 100; j = j + 2) {
        // a = m2 - n2
        double m = Math.pow(i, 2);
        double n = Math.pow(j, 2);
        if (m < n) {
          a = n - m;
        } else {
          a = m - n;
        }
        // b = 2mn
        b = 2 * i * j;
        // c = m2 + n2
        c = m + n;

        if (Math.pow(c, 2) <= 6000) {
          cnt++;
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
      }
    }
    System.out.println("c²が6000以下のピタゴラスの定理は[" + cnt + "]件ありました");
  }

}