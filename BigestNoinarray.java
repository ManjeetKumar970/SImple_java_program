package OOPS;

import java.util.Scanner;

public class BigestNoinarray {
    private static int biggesNum(int arr[]) {
        int big = 0;
        if (arr.length == 0)
            return 0;
        for (int i = 0; i < arr.length; i++) {
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        return big;
    }

    private static int[] userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void Dispaly(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        int mk[] = userInput();
        Dispaly(mk);
        int val = biggesNum(mk);
        System.out.println("Biggest No is -> " + val);

    }

}
