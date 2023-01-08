package JspiderClass.BookPatten;

import java.util.Scanner;

public class patten1 {
    /*
     * 1
     * 101
     * 10101
     * 1010101
     * 101010101
     */

    static void Patten(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j % 2 + "");
            }
            System.out.println();
        }

    }
    /*
     * 1
     * 121
     * 12321
     * 1234321
     * 123454321
     */

    static void Patten2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void Patten3(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(x % 2);
                x++;
            }
            System.out.println();
        }

    }

    static void Patten4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) (96 + j));

            }
            System.out.println();
        }

    }

    static void Patten5(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "* ");

            }
            System.out.println();
        }

    }

    static void Patten6(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) (64 + j));

            }
            System.out.println();
        }

    }

    private static void patten7(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 2) {

            }

            else {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                int count = i;
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(count);
                    if (j < i) {
                        count--;
                    } else {
                        count++;
                    }
                }
            }
            if (i == 2) {

            } else
                System.out.println();
        }
    }

    static void Patten15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    static void DimanodPatten(int n) {
        int sp = n / 2;
        int str = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");

            }

            for (int j = 1; j <= str; j++) {
                if (j == 1) {
                    System.out.print("* ");
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

    static void HoloRegtanglr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == n || j == n || i == j || i == (n + 1) - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

    static void Patten8(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            int x = i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) (96 + x) + " ");
                if (j < i) {
                    x--;
                } else
                    x++;
            }

            System.out.println();
        }
    }

    static void patten11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

    static void patten13(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            int x = i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(x + " ");
                if (j < i) {
                    x--;

                } else {
                    x++;
                }
            }
            System.out.println();
        }

    }

    static void patten16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (64 + j));
            }
            System.out.println();
        }
    }

    static void patten17(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
    }

    static void patten20(int n) {
        for (int i = 1; i <= n; i++) {
            int x = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");

                x = x + n - j;
            }

            System.out.println();
        }

    }

    static void patten21(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(x % 2);
                x++;

            }

            System.out.println();

        }

    }

    static void patten22(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print(x % 2);
                x++;

            }

            System.out.println();

        }

    }

    static void patten25(int n) {
        n = (n + 1) / 2;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            int k = 0;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("" + (char) (ch + k));
                if (j < (2 * i + 1) / 2)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
        n = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            int k = 0;
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("" + (char) (ch + k));
                if (j < (2 * (n - i) - 1) / 2)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
    }

    private static void bkpatten6(int n) {
        for (int i = n; i >= 1; i--) {
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

    private static void patten23(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(count);

                if (j <= n) {
                    count++;

                }
                if (count == 10) {
                    count = 1;
                }

            }

            System.out.println();
        }

    }

    private static void patten24(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(count);

                count++;
                if (count == 10) {
                    count = 1;
                }

            }

            System.out.println();
        }

    }

    private static void patten36(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == n / 2 + 1 || j == n || i == n || j == n / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    private static void patten30(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == n || n == i || i == j || i == n - j + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static void patten38(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j == n / 2 + 1 || i == n / 2 + 1 || i == j || i == n - j + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static void patten37(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n || j == n / 2 + 1 || i == n / 2 + 1 || i == j
                        || i == n - j + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Patten(n);
        // Patten2(n);
        // Patten3(n);
        // Patten4(n);
        // Patten5(n);
        // Patten6(n);
        // patten7(n);
        // Patten15(n);
        // HoloRegtanglr(n);
        // DimanodPatten(n);
        // Patten8(n);
        // patten11(n);
        // patten13(n);
        // patten16(n);
        // patten17(n);
        // patten18(n);
        // patten20(n);
        // patten21(n);
        // patten25(n);
        // bkpatten6(n);
        // patten23(n);
        // patten24(n);
        // patten36(n);
        // patten30(n);
        // patten38(n);
        // patten37(n);

    }
}