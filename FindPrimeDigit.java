package OOPS;

import java.util.Scanner;

public class FindPrimeDigit {
    // prime digit =0,1,2,3,5,7
    static int checkHowManyPrimeDigitInNum(int n) {
        int count = 0;
        while (n != 0) {

            int r = n % 10;
            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 5 || r == 7) {

                count++;
            }

            n = n / 10;

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = checkHowManyPrimeDigitInNum(n);
        System.out.println(digit);
    }

}
