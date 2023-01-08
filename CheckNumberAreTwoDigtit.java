package JspiderClass;

import java.util.Scanner;

public class CheckNumberAreTwoDigtit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("spicel number of sum");
        int x = sc.nextInt();
        int d1 = x / 10;
        int d2 = x % 10;
        int sum = d1 * d2 + d1 + d2;
        if (sum == x) {
            System.out.println("spicel number is  sum \t" + sum);
        } else
            System.out.println("spicel are not  \t" + sum);

    }

}
