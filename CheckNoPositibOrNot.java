package JspiderClass;

import java.util.Scanner;

public class CheckNoPositibOrNot {
    static int numberArePostiveOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check No are Positibe or Not");
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("Negative" + x);
        } else
            System.out.println("postive" + x);
        return x;
    }

    static double CheckPersorAre18PlusOrNot() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No You  want to check Person 18+ or not");
        double x = sc.nextDouble();
        if (x <= 18) {
            System.out.println("Person are Eligibal ");

        } else {
            System.out.println("Person less than 18+ than he not eligibak to vote");
        }
        return x;
    }

    static String checkLengthOrName() {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        System.out.println(y.length() + "   " + x.length());

        if (x.length() > y.length()) {
            System.out.println(x + "  Higher Length " + x.length());
        } else {
            System.out.println(y + "  Higher Length " + y.length());
        }

        return x;
    }

    public static void main(String[] args) {
        // numberArePostiveOrNot();
        // CheckPersorAre18PlusOrNot();
        checkLengthOrName();
    }

}
