public class Main {
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;
  }
