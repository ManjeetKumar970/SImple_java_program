package Maths;
import java.util.*;

// program to reverse number in array using swipping
public class NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array sizze");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" Number" );
        int rv[] = new int[size];
        int temp;
        int i;
        //input 
        for( i=0;i<size;i++){
            rv[i]=sc.nextInt();        
            
        }
        // revers
        for( i=0;i<size;i++){
          
           temp=rv[i]; 
           rv[i]=rv[size-i-1];
           rv[size-i-1]=temp;
            
           
        }
        System.out.println("NUmber is Converted "+size+" Number" );

        for(i=0;i<size;i++){
            System.out.print(rv[i]);
        }
        
       
        //output
        
    }
    
}
