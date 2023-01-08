package OOPS;

import java.util.Scanner;

public class Diserium {

    static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;

        }
        return count;
    }

    static int powerOfNumber(int n, int pwer) {
        int pw = 1;
        while (pwer > 0) {
            pw = pw * n;
            pwer--;
        }
        return pw;
    }

    static boolean DiseriumNumberOfNot(int n) {
        int sum = 0;
        int temp = n;
        int dc = countDigit(n);
        do {
            int r = n % 10;
            sum = sum + powerOfNumber(r, dc);
            dc--;
            n = n / 10;

        } while (n != 0);

        if (sum == temp) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (DiseriumNumberOfNot(i)) {
                System.out.print(i + " ,");
            }
        }

    }
}
