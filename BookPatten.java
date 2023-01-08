package OOPS;

import java.util.Scanner;

public class BookPatten {

    static void patten1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                for (int k = j; k < i; k++) {
                    System.out.print("*");
                    break;
                }
            }
            if (n == i)
                System.out.print("*");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        patten1(10);

    }

}
