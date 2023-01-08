package Number_sets;

public class Fabonic {

  public static void main(String[] args) {
    // find fibonic series // 0,1,1,,3,1,25,8,13..... (strting two position numbr
    // add and create 3 position)
    int N = 7;
    int a = 1;
    int b = 1;
    int c = 0;

    for (int i = 0; i <= N; i++) {
      System.out.println(a);
      c = a + b;
      a = b;
      b = c;
    }

  }

}