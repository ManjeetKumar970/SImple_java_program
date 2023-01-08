import java.util.Scanner;

public class primArray {
    static int countPrime(int a[]) {
        int pc = 0;
        for (int i = 0; i < a.length; i++) {
            if (isprime(a[i]))
                pc++;
        }
        return pc;
    }

    static boolean isprime(int n) {
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int count = countPrime(ar);
        System.out.println("no of prime element is " + count);
    }
}
