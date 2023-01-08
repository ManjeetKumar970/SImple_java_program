package OOPS;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sml = c;
        int smallNumber = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(smallNumber);
    }
}