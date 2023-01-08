package JspiderClass;

import java.util.*;

public class CheckValueAreEqualOrNOt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big = 0;

        System.out.println(" First Number");
        int x = sc.nextInt();
        System.out.println("Second  Number");
        int y = sc.nextInt();
        System.out.println("Third  Number");
        int z = sc.nextInt();

        if (x == y) {
            System.out.println("x equal to y");
        }
        if (y == z) {
            System.out.println("y equlas to z");
        }
        if (z == x) {
            System.out.println("z equal to x");
        }
    }

}
