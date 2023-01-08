package Maths.Maths;

public class AddArraySeries {

    public static void main(String[] args) {
        // int arr[] = { 2, 3, 5, 1 };
        // int arr1[] = { 2, 3, 5, 1 };
        // int sum = 0;

        // for (int i = 0; i < arr.length - 1 && i<arr1.length-1; i++) {
        // sum += arr1[i]+arr[i];
        // }
        // System.out.println(sum);

        int arr[] = { 3, 2, 1, 6 };
        int n = 3;

        System.out.println(sumElement(arr, 0));
    }

    public static int sumElement(int arr[], int n) {
        // Your code here
        int sum = 1;

        for (n = 0; n < arr.length; n++) {// 0+0
            sum = sum * arr[n];
        }
        return sum;
    }
}
