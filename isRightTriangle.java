import java.util.*;

public class isRightTriangle{

   public static void main(String s[]){

       Scanner sc=new Scanner(System.in);

       int a,b,c;

       System.out.print("Enter length of largest side: ");

       a=sc.nextInt();

       System.out.print("Enter length of base: ");

       b=sc.nextInt();

       System.out.print("Enter length of height: ");

       c=sc.nextInt();

       sc.close();

       if(a * a == b * b + c * c)

           System.out.println("\nIt is a Right angled triangle.");

       else

           System.out.println("\nIt is not a right angled triangle.");

   }

} 
    

