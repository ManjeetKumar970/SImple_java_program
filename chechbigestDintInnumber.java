package OOPS;

import java.util.Scanner;

public class chechbigestDintInnumber {

    static int findBigestDigintInNumber(int n) {
        int bigDigit = -9;
        if (n == 0)
            return 0;

        while (n != 0) {
            int reminder = n % 10;
            if (reminder > bigDigit) {
                bigDigit = reminder;
            }
            n = n / 10;
        }
        return bigDigit;
    }

    static int findSmallestDigintInNumber(int n) {
        int bigDigit = 9;
        if (n == 0)
            return 0;

        while (n != 0) {
            int reminder = n % 10;
            if (reminder < bigDigit) {
                bigDigit = reminder;
            }
            n = n / 10;
        }
        return bigDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int big = findBigestDigintInNumber(n);
        // System.out.println(big);
        int sml = findSmallestDigintInNumber(n);
        System.out.println(sml);
    }

}
