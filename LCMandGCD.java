package Maths.Maths;

import java.util.Scanner;

public class LCMandGCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find To number LCM AND GCD");
        int A = sc.nextInt();
        System.out.println("Endter second No");
        int B = sc.nextInt();

        int GCD = 0;// GCD Called HCF
        int LCM = 0;
        int i = 1;
        for (i = 1; i < B; i++) {
            if (A % i == 0 && B % i == 0) {
                GCD = i;
            }

        }

        LCM = (A * B) / GCD; // LCM Formula if you find GCD number than easy to find Lcm
        System.out.println("GCD =\t" + GCD);
        System.out.println("LCM =\t" + LCM);

    }
}
