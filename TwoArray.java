import java.util.Scanner;

public class TwoArray {

  public static void main(String[] args) {
    // manual Entery in 2D array
    TwoArray tw = new TwoArray();
    // tw.manualEntery();
    tw.autoInput();

  }

  /*
   * private void manualEntery() {
   * 
   * int matrix1[][] = { { 2, 3 }, { 6, 7 } };
   * for (int i = 0; i < matrix1.length; i++) {
   * for (int j = 0; j < matrix1.length; j++) {
   * System.out.print("\t[" + i + "[" + j + "]\t" + matrix1[i][j]);
   * }
   * System.out.println();
   * }
   * 
   * }
   */

  private void autoInput() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number Row");
    int row = sc.nextInt();
    System.out.println("Enter Number Colume");
    int col = sc.nextInt();
    int matrix2[][] = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix2[i][j] = sc.nextInt();
      }

    }

    // output
    System.out.println("Display Matrix");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("[" + i + "][" + j + "]\t" + matrix2[i][j]);
      }
      System.out.println();
    }
    // search no and add*2
    System.out.println("Search Data");
    int FindNumber = sc.nextInt();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (FindNumber == matrix2[i][j]) {
          System.out.println("Data Found--\t[" + i + "][" + j + "]\t" + matrix2[i][j]);

        }

      }
    }

  }

}