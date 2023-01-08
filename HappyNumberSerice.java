package OOPS;

import java.util.Scanner;

public class HappyNumberSerice {

    static boolean happyChek(int n) {
        if (n == 1 || n == 7)
            return true;
        int sum = n, x = n;

        while (sum > 9) {
            sum = 0;
            // this loop finds the sum of square of digits
            while (x > 0) {
                int d = x % 10;
                sum += d * d;
                x /= 10;
            }

            x = sum;
        }

        return x == 1 || x == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (happyChek(i)) {
                System.out.println(i);
            }
        }

    }

}
