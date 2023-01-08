package JspiderClass;

import java.util.Scanner;

public class CheckMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month");
        int x = sc.nextInt();
        if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
            System.out.println("this month is 31");
        } else {
            System.out.println("30 Days");
        }

    }

}
