package OOPS;

public class ChekLeapYearOrNot {

    static boolean checkLeapYearOrNot(int n) {

        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            return true;

        } else
            return false;

    }

    public static void main(String[] args) {
        boolean br = checkLeapYearOrNot(2018);
        System.err.println(br);

    }

}
