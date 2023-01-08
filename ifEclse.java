package JspiderClass;

import java.util.Scanner;

public class ifEclse {
    static Scanner sc = new Scanner(System.in);

    static void checkEvenOrOdd1() {

        System.out.println("Chheck Odd Even Using Switch");
        int x = sc.nextInt();
        switch (x % 2) {
            case 0:
                System.out.println("Even");
                break;

            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Enter Interger Only");
                break;
        }

    }

    static void checOddEven() {
        System.out.println("Check value are Even or odd");
        int x = sc.nextInt();
        if (x / 2 * 2 == x) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    static void WithoutUsingCOntrolStatmentFIndEvenOROdd() {
        System.out.println("Check Value Odd Or Even");
        int x = sc.nextInt();
        String arr[] = { "Even", "ODD" };
        System.out.println(arr[x % 2]);
    }

    public static void main(String[] args) {
        checkEvenOrOdd1();
        checOddEven();
        WithoutUsingCOntrolStatmentFIndEvenOROdd();
    }

}
