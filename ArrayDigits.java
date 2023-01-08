package Maths.Maths;

public class ArrayDigits {
    static int isPossible(int N, int arr[]) {
        // code here
        int reminder = 0;
        for (N = 0; N < arr.length; N++) {
            reminder = (reminder + arr[N]) % 3;

        }
        if (reminder != 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 2 };
        int N = 2;
        System.out.println(isPossible(0, arr));
    }
}
// Input: N = 2
// arr = {1, 4}
// Output: 0
// Explaination: The numbers we can form
// are 14 and 41. But neither of them are
// divisible by 3
// remider =reminder+arr[i]%3
