package JspiderClass;

import java.util.Scanner;

public class SmaillNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First No");
        int x = sc.nextInt();
        System.out.println("Second No");
        int y = sc.nextInt();

        int sml = x;
        if (y < sml)
            sml = y;
        System.out.println("Smallest No " + sml);
    }

}
