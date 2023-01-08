package OOPS;

import java.util.Scanner;

public class findmidn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();// 8
        int b = sc.nextInt();// 9
        int c = sc.nextInt();// 10
        if (a != b || b != c || c != a) {
            System.out.println("two number never same");
        }

        if (a < b && a < c) {
            System.out.println("mid " + a);
        } else if (b < a && b < c) {
            System.out.println(" mid" + b);

        } else if (c < a && c < b) {
            System.out.println(c);
        } else {
            System.out.println("enter valid no");
        }

    }
}
