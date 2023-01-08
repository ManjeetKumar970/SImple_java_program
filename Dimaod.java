package JspiderClass.BookPatten;

import java.util.Scanner;

import string.str;

public class Dimaod {

    static void DimanodPatten(int n) {
        int sp = n / 2;
        int str = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");

            }

            for (int j = 1; j <= str; j++) {
                System.out.print("* ");
            }
            if (i <= n / 2) {
                sp--;
                str = str + 2;
            } else {
                sp++;
                str = str - 2;
            }
            System.out.println();

        }

    }

    static void alpbetDimand(int n) {
        int sp = n / 2;
        int alpha = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int x = alpha / 2 + 1;
            for (int j = 1; j < alpha; j++) {
                System.out.print(x);
                if (j < alpha / 2) {
                    x--;
                } else {
                    x++;
                }
                if (i <= n / 2) {
                    alpha = alpha + 2;
                    sp--;
                } else {
                    alpha = alpha - 2;
                    sp++;
                }

            }
            System.out.println();
        }
    }

    private static void dhoolpatten(int n) {
        int sp = 0;
        int str = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print("*");

            }
            if (i <= n / 2) {
                sp++;
                str = str - 2;
            } else {
                sp--;
                str = str + 2;
            }
            System.out.println();

        }

    }

    private static void modPatten(int n) {
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= st; k++) {
                System.out.print(k % 2);
            }

            // To goto next line
            System.out.println();
            if (i <= n / 2) {

                // sp decreased by 1
                // st increased by 2
                sp = sp - 1;
                st = st + 2;
            }

            else {

                // sp increased by 1
                // st decreased by 2
                sp = sp + 1;
                st = st - 2;
            }
        }
    }

    private static void numberpatten(int n) {
        int sp = n / 2;
        int numb = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int count = numb / 2 + 1;
            for (int j = 1; j <= numb; j++) {
                System.out.print(count);
                if (j <= numb / 2) {
                    count--;
                } else {
                    count++;
                }
            }
            System.out.println();
            if (i < n / 2) {
                sp = sp - 1;
                numb = numb + 2;
            } else {
                sp = sp + 1;
                numb = numb - 2;
            }
        }

    }

    private static void holodimand(int n) {
        int sp = n / 2;
        int str = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= str; j++) {
                // System.out.print(str + "* ");
                if (j == 1 || j == str) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            if (i <= n / 2) {
                sp--;
                str = str + 2;
            } else {
                sp++;
                str = str - 2;
            }
            System.out.println();

        }

    }

    private static void numberPatten2(int n) {

    }

    private static void Mpatten(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                if (j == n) {
                    System.out.print(" ");
                } else
                    System.out.print(j);
            }
            System.out.println();

        }
    }

    private static void dhoolpatten33(int n) {
        int sp = 1;
        int str = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int x = 1;
            for (int j = 1; j <= str; j++) {
                System.out.print(x);

                {
                    if (j <= str / 2) {
                        x++;
                    } else {
                        x--;
                    }
                }
            }
            if (i <= n / 2) {
                sp++;
                str = str - 2;
            } else {
                sp--;
                str = str + 2;
            }
            System.out.println();

        }

    }

    private static void dhoolpatten27(int n) {
        int sp = 0;
        int str = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            int count = sp + 1;
            for (int j = 1; j <= str; j++) {
                System.out.print((char) (64 + count));
                if (j <= str / 2) {
                    count++;

                } else {
                    count--;

                }

            }

            if (i <= n / 2) {
                sp++;
                str = str - 2;
            } else {
                sp--;
                str = str + 2;
            }

            System.out.println();
        }
    }

    private static void patten28(int n) {
        int sp = n / 2;
        int str = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int count = 1;
            for (int j = 1; j <= str; j++) {
                System.out.print(count);
                if (j < i) {
                    count++;
                } else
                    count--;

            }
            if (i <= n / 2) {
                sp--;
                str = str + 2;
            } else {
                sp++;
                str = str - 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // DimanodPatten(n);
        // alpbetDimand(n);
        // dhoolpatten(n);
        // modPatten(n);
        // numberpatten(n);
        // holodimand(n);
        // numberPatten2(n);
        // Mpatten(n);
        // dhoolpatten33(n);
        // dhoolpatten27(n);
        patten28(n);
    }

}
