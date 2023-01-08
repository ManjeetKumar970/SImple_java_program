package Maths;
import java.util.*;


public class revs {
    
public static void main(String args[]){
    

    System.out.println("Enter Number Youw want to revese");
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    int num_rev=0;
    while(num>0){
       num_rev = num_rev*10+num%10;
       num=num/10;
        
    }
    System.out.println(num_rev);

    
}
    
}
