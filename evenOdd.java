package Maths;

import java.util.*;

class evenOdd {
    
    public static void main(String args[]) {
        System.out.println(oddEven(0));

    }

    static String oddEven(int N) {


        if (N % 2 == 0) {
           
            return "Even";
        } else {
           
            return "ODD";
        }

    }

}
