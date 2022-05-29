public class Main {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[5];
    scores[1] = 30;
    scores[2] = 23;
    scores[4] = new java.util.Random().nextInt(3);
    System.out.println(scores[4]);
    System.out.println(scores[2]);
    System.out.println(scores[1]);
  }
}
