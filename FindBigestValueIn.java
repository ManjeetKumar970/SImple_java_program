package Maths.Maths;

import java.util.*;

public class FindBigestValueIn {
    // finding largest valuse in array

    static int FindBigestValuseInArray(int arr[]) {
        int size = arr.length;
        int i;
        int BigValue = 0;
        for (i = 0; i < size; i++) {
            if (BigValue < size) {
                BigValue = arr[i];

            }
        }
        return BigValue;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 100, 5, 8 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(FindBigestValuseInArray(arr));
            break;
        }

    }

}
