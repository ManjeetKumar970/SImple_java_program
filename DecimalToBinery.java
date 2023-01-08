package OOPS;

import java.util.Scanner;

public class DecimalToBinery {

    static int decToBin(int n) {
        String str = "";

        do {

            int r = n % 2;
            str = r + str;
            n = n / 2;

        } while (n != 0);
        int lo = Integer.parseInt(str);
        return lo;
    }

    static String decToHex(int n) { // hex means 16
        String hex = "";
        do {

            int r = n % 16;
            if (r < 10) {
                hex = r + hex;
            } else {
                hex = (char) (r + 55) + hex;
            }

            n = n / 16;

        } while (n != 0);

        return hex;
    }

    static String decToOct(int n) { // hex means 16
        String oct = "";
        do {

            int r = n % 8;
            oct = oct + r;
            n = n / 8;

        } while (n != 0);

        return oct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO CONVERT DECIMAL TO BINERY TRYPES");
        int n = sc.nextInt();

        System.out.println("DECMAL TO BINERY VALUE -\t" + decToBin(n));
        System.out.println("DECMAL TO OCTAL VALUE -\t" + decToOct(n));
        System.out.println("DECMAL TO HEX VALUE -\t" + decToHex(n));
    }

}
