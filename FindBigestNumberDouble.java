package JspiderClass;

import java.util.Scanner;

public class FindBigestNumberDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double big = x;
        if (y > big)
            big = y;
        if (z > big)
            big = z;

        System.out.println("Big " + big);

    }

}
