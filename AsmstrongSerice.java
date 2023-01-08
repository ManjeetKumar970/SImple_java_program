package OOPS;

import java.util.Scanner;

public class AsmstrongSerice {
    static int DigitCount(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static int powerOfNumber(int n, int p) {
        int pw = 1;
        while (p > 0) {
            pw = pw * n;
            p--;
        }
        return pw;
    }

    static boolean armstrongNumber(int n) {
        int numberOfPower = DigitCount(n);
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum = sum + powerOfNumber(r, numberOfPower);
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Value are armstrong or Not");
        int inpt = sc.nextInt();
        for (int i = 0; i <= inpt; i++) {
            if (armstrongNumber(i))
                System.out.println(i);
        }
    }
}
