package Maths.Maths;

public class TwoBigNoSum {

    static void LargestNumberSumInGivenArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // swip number
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

    }

    static void Printarrray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 20, 90, 30, 45, 1, 5, 25, 6 };

        LargestNumberSumInGivenArray(arr);
        Printarrray(arr);
        int large2No = arr[arr.length - 1] + arr[arr.length - 2];
        System.out.println();
        System.out.println(large2No);

    }

}
