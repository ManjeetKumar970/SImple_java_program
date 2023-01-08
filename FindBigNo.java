package Maths.Maths;

public class FindBigNo {

    public static void main(String[] args) {
        int arr[] = { 20, 25, 20, 200, 1 };
        int largeno = 0;
        int smallNo = arr.length - 1;

        FindBigNoInArray(arr);

        System.out.println(arr[largeno]);
        System.out.println(arr[smallNo]);

    }

    static void FindBigNoInArray(int arr[]) {

        for (int l = 0; l < arr.length; l++) {
            for (int s = l + 1; s < arr.length; s++) {
                if (arr[l] < arr[s]) {
                    int temp = arr[l];
                    arr[l] = arr[s];
                    arr[s] = temp;

                }

            }

        }

    }
}
