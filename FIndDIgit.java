package Number_sets;

import java.util.Scanner;

public class FIndDIgit {
    static void FIndDIgit1() {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        String ars = new String();
        int count = 0;

        if (s == 0) {
            System.out.println(0);
        } else {
            // Int convert into String
            ars = ars.valueOf(s);
            System.out.println(ars.length());

        }
        // String convert into char
        for (int i = 0; i < ars.length(); i++) {
            char a = ars.charAt(i);
            count++;
        }
        System.out.println(count);

    }

    static void checkDiggit() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        // FIndDIgit1();
        // checkDiggit();

    }
}