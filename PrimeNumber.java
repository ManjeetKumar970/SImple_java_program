import java.util.Scanner;

public class PrimeNumber {

    public static int PrimeNo(int ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int temp = n / 2;
        int count = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + "Prime Number");
        } else {
            for (int i = 2; i <= temp; i++) {
                if (n % i == 0) {
                    System.out.println(n + "Not Prime NUmber");
                    count = 1;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println(n + " is Prime Number");
        }

        return n;
    }

    public static void main(String[] args) {
        int val = PrimeNo(0);
        System.out.println(val);

    }
}
