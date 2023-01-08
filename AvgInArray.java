package OOPS;

import java.util.Scanner;

public class AvgInArray {
    private static int[] userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static double avgOfArray(int arr[]) {
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        avg = sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int mk[] = userInput();
        double val = avgOfArray(mk);
        System.out.println("Avrage of = " + val);

    }
}
