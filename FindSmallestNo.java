package OOPS;

import java.util.Scanner;

public class FindSmallestNo {
    private static double findSmlNo(double arr[]) {
        double sml = 9;
        if (arr.length == 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if (sml > arr[i]) {
                sml = arr[i];
            }
        }
        return sml;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        double arr[] = new double[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        double val = findSmlNo(arr);
        System.out.println(val);
    }
}