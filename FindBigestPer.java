package JspiderClass;

import java.util.Scanner;

public class FindBigestPer {
    private static double bigPer(double ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        double avg = 0;
        double arr[] = new double[n];
        double bigper = 0;
        if (n == 0) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            bigper = bigper + arr[i];
            avg = bigper / n;

        }
        System.out.println(bigper);

        System.out.println(avg);

        return avg;

    }

    public static void main(String[] args) {

        double val = bigPer(null);
        System.out.println("Smal PerCentage is  -\t" + val);
    }

}
