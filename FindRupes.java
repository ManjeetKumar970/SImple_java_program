package JspiderClass;

import java.util.*;

public class FindRupes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupess = sc.nextInt();

        System.out.println("2000 Note \t" + rupess / 2000);
        rupess = rupess % 2000;
        System.out.println("500 note \t " + rupess / 500);
        rupess = rupess % 500;
        System.out.println("200 Note \t" + rupess / 200);
        rupess = rupess % 200;
        System.out.println("100 Note \t" + rupess / 100);
        rupess = rupess % 100;
        System.out.println("50 Note \t" + rupess / 50);
        rupess = rupess % 50;
        System.out.println("20 Note \t" + rupess / 20);
        rupess = rupess % 20;
        System.out.println("10 Note \t" + rupess / 10);
        rupess = rupess % 10;
        System.out.println("5 Note \t" + rupess / 5);
        rupess = rupess % 5;
        System.out.println("1 Note \t" + rupess / 1);
        rupess = rupess % 1;

    }

}
