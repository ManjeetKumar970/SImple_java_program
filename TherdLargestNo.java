package Maths.Maths;

public class TherdLargestNo {

    static int TherdLargestNoInArray(int arr[], int n) {
        int i;
        int FirstdOne = 0;
        int SecondOne = Integer.MIN_VALUE;
        int TherdOne = Integer.MIN_VALUE;
        if (n > 3) {
            return -1;
        }
        for (i = 0; i < arr.length; i++) {

            if (FirstdOne < arr[i]) {
                TherdOne = SecondOne;
                SecondOne = FirstdOne;
                FirstdOne = arr[i];

            } else if (SecondOne < arr[i]) {
                SecondOne = TherdOne;
                SecondOne = arr[i];

            } else if (TherdOne < arr[i]) {
                TherdOne = arr[i];
            }
        }
        return FirstdOne;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 8, 7, 6, 5, 11 };
        System.out.println(TherdLargestNoInArray(arr, 1));
    }

}
