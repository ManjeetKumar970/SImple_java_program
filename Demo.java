import java.util.*;

import OOPS.sylemOrPhoem;
import string.reversa;

public class Demo {
  

  public static void main(String[] args) {

    int arr[]={1,2,3,4,5};
    System.out.println(Arrays.toString(arr));
    int size=arr.length;
    int pos=2;
    int update=5;
    int arr1[]=new int[arr.length+1];
    for(int i=0;i<arr.length+1;i++){
     if(i<pos){
       arr1[i]=arr[i];

     }else if(i==pos){
      arr1[i]=update;
     }else{
      arr1[i]=arr[i-1];
     }
    }
   
  
 System.out.println(Arrays.toString(arr1));
  }

}
