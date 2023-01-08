import java.util.*;

public class ReplaceData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of Array\n");
        int size = sc.nextInt();
        int arry[] = new int[size];

        // input to user
        for (int i = 0; i < size; i++) {
            arry[i] = sc.nextInt();
        }

        // display
        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "]--\t" + arry[i]);
        }
        // replace Data
        System.out.println("Select data you want to Replace");
        int selt = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (selt == arry[i]) {
                System.out.println("Data is Selected ["+i+"]--\t"+arry[i]);
                System.out.println("Enter Data you want to Replace Data");
                int replc = sc.nextInt();
                arry[i]=replc;
               
            }

        }
        // display
        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "]--\t" + arry[i]);

    }
}
}