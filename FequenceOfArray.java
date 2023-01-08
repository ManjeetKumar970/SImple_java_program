import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FequenceOfArray {
    
   
public static void main(String[] args) {

   
    int arr[] ={1,2,2,3,4,5,6,6,6};
    int fequence[] = new int[arr.length];
    int vist=-1;
     for(int i=0;i<arr.length;i++){
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                fequence[j]=vist;
            }
            if(fequence[i]!=vist){
                fequence[i]=count;
            }
        }
     }
     System.out.println("fequence | Array Number  ");
   for(int i=0;i<fequence.length;i++){
    if(fequence[i]!=vist){
       
        System.out.println(fequence[i]+ "     |    "+arr[i]);
    }
   }
     
}    
    
}
