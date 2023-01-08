package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDeclearthion {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       //add data in list
       list.add(5);
       list.add(500);
       list.add(30);

  //get Data in list
       System.out.println(  list.get(0));
    
    //add elements between two number
     list.add(3, 500);

     // replace data or update data
     list.set(3, 100);

     // delete data in array list

     list.remove(0);

     // array list short 
     Collections.sort(list);

    System.out.println();
     for(int i=0;i<list.size();i++){
        System.out.println(i+"  \t"+list.get(i));
     }
     System.out.println(list);

    }

    
}
