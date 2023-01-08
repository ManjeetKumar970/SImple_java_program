package Maths.Maths;

public class MissingNoAddition {

  public static void main(String[] args) {

    // Input:
    // N = 5
    // Output: 1 1 2 3 5
    System.out.println(printFibb(0));

  }

  public static long printFibb(int n) {
    long a = 0;
    long b = 1;
    long c = 0;
    for (int i = 0; i <= n; i++) {
      System.out.println(a);
      c = a + b;
      a = b;
      b = c;

    }
    return c;

  }

}