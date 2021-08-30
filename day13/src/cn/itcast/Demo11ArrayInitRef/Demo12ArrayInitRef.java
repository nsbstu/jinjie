package cn.itcast.Demo11ArrayInitRef;

public class Demo12ArrayInitRef {
    private static int[] initArray(int length, ArrayBuilder builder) {
        return builder.buildArray(length);
    }

  /*  public static void main(String[] args) {
        int[] array = initArray(10, length -> new int[length]);
    }*/
  public static void main(String[] args) {
      int[] array = initArray(10, int[]::new);
  }
}
