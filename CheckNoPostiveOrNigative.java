package OOPS;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class CheckNoPostiveOrNigative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tusday");
                break;
            case 4:
                System.out.println("Wensaday");
                break;
            case 5:
                System.out.println("Thusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Sataday");
                break;

            default:
                System.out.println("Enter the day 1 to 7");

        }
    }
}
