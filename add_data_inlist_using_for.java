package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class add_data_inlist_using_for {

    public static void Add_Data_in_list_using_for() {
        int a = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("Enter the Number");
        for (int i = 0; i < input; i++) {
            a = sc.nextInt();
            list.add(a);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        // remove any data
        System.out.println("\nSelect Data");
        int rev = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
           
            if (list.get(i) == rev) {
                list.remove(i);

            } 
        }
       
        System.out.println(list);
    }

    public static void main(String[] args) {
       
        add_data_inlist_using_for n = new add_data_inlist_using_for();
        Add_Data_in_list_using_for();
 

    }

}
