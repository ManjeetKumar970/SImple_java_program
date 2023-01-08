package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class FindDoubleNo {

  
public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(5);
    list.add(3);
    list.add(3);
    list.add(2);
    list.add(25);
    list.add(25);
    int i=0;
    while(i<list.size()-1){
       for(int j=i+1;j<list.size();j++){
           if(list.get(i)==list.get(j)){
            System.out.println(list.get(j));
           }else{
            
           }
       }
       i++;
    }
    System.out.println(list);
}
    
    
   
        

}
